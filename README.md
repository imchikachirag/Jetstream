# Salesforce Streaming API Toolkit For Java
The Force.com Streaming API is a Bayeux implementation built on the Force.com platform.  The toolkit for Java provides a simple way to configure a connection to the Streaming API.  For more information on the Force.com Streaming API, please review the [guide](http://wiki.developerforce.com/index.php/Getting_Started_with_the_Force.com_Streaming_API).

The following instructions assume some knowledge of the Force.com platform.  If you are unfamiliar with Force.com, please visit http://developer.force.com.

## Install
1. git clone git://github.com/naamannewbold/streaming.git
2. cd streaming
3. mvn install -DskipTests
4. export FORCE_FORCEDATABASE_URL="force://instance.salesforce.com;user=username@org;password=password"
5. add the following to your own pom.xml

```xml
        <dependency>
            <groupId>com.force.sdk.streaming</groupId>
            <artifactId>streaming</artifactId>
            <version>0.11</version>
        </dependency>
        <dependency>
            <groupId>com.google.inject</groupId>
            <artifactId>guice</artifactId>
            <version>3.0</version>
        </dependency>
```

```xml
        <repository>
            <id>repo</id>
            <url>https://raw.github.com/naamannewbold/repo/master/releases/</url>
        </repository>
```
Note: at some point in the future, the guide dependency will be abstracted out.

## Java Usage
```java
        Injector injector = Guice.createInjector(new ForceStreamingClientModule());
        ForceBayeuxClient client = injector.getInstance(ForceBayeuxClient.class);
        PushTopicManager pushTopicManager = injector.getInstance(PushTopicManager.class);
        PushTopic topic = pushTopicManager.getTopicByName(name);
        client.subscribeTo(topic, new ClientSessionChannel.MessageListener() {
            public void onMessage(ClientSessionChannel channel, Message message) {
                LOGGER.debug("Received message on " + channel.toString());
                remote.deliver(getServerSession(), "/force", message, null);
            }
        });
```

## Java Web Project Usage
The primary use case intended for a web project is as a proxy. Due to cross-domain limitations, javascript cannot callout to the streaming API unless it's on force.com or salesforce.com. This servlet allows javascript to interact with the streaming API.

6. Add this dependency to your pom.xml

        <dependency>
            <groupId>com.force.sdk.streaming</groupId>
            <artifactId>streaming</artifactId>
            <version>0.11</version>
        </dependency>

7. in your web project, add the following to your web.xml

        <servlet>
            <servlet-name>cometd</servlet-name>
            <servlet-class>org.cometd.server.CometdServlet</servlet-class>
            <load-on-startup>1</load-on-startup>
        </servlet>
        <servlet-mapping>
            <servlet-name>cometd</servlet-name>
            <url-pattern>/cometd/*</url-pattern>
        </servlet-mapping>
        <servlet>
            <servlet-name>initializer</servlet-name>
            <servlet-class>com.force.sdk.streaming.server.ForceStreamingResource</servlet-class>
            <load-on-startup>2</load-on-startup>
        </servlet>

8. wire your javascript client to talk to /force/topicName, e.g.

        <html>
            <head>
                <script type="text/javascript" src="/jquery/jquery-1.6.2.js"></script>
                <script type="text/javascript" src="/jquery/json2.js"></script>
                <script type="text/javascript" src="/org/cometd.js"></script>
                <script type="text/javascript" src="/jquery/jquery.cometd.js"></script>
                <script type="text/javascript">
                (function($)
        	{
        	    var cometd = $.cometd;
        
        	    $(document).ready(function()
        	    {
        		function _metaHandshake(handshake)
        		{
        		    if (handshake.successful === true)
        		    {
        			cometd.batch(function()
        			{
        			    cometd.subscribe('/force/products', function(messages) {
        				$("body").append('<pre>' + JSON.stringify(messages) + '</pre>');
        			    });
        			});
        		    }
        		}
        
        		// Disconnect when the page unloads
        		$(window).unload(function()
        		{
        		    cometd.disconnect(true);
        		});
        
        		var cometURL = location.protocol + "//" + location.host + config.contextPath + "/cometd";
        		cometd.configure({
        		    url: cometURL
        		});
        
        		cometd.addListener('/meta/handshake', _metaHandshake);
        
        		cometd.handshake();
        	    });
        	})(jQuery);
        
                var config = {
                    contextPath: '${pageContext.request.contextPath}'
                };
                </script>
            </head>
            <body>
            </body>
        </html>

