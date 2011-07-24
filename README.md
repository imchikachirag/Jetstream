
# Salesforce Streaming API Toolkit For Java
The Salesforce Streaming API is a Bayeux implementation built on the Force.com platform.  The toolkit for Java provides a simple way to configure a connection to the Streaming API.

The following instructions assume some knowledge of the Force.com platform.  If you are unfamiliar, please visit http://developer.force.com.

## Usage
    1. git clone git://github.com/naamannewbold/streaming.git
    2. cd streaming
    3. mvn install -DskipTests
    4. export FORCE_FORCEDATABASE_URL="force://instance.salesforce.com;user=username@org;password=password"
    5. add the following to your own pom.xml
```xml
        <dependency>
            <groupId>com.force.sdk.streaming</groupId>
            <artifactId>streaming</artifactId>
            <version>0.1</version>
        </dependency>
        <dependency>
            <groupId>org.cometd.javascript</groupId>
            <artifactId>cometd-javascript-jquery</artifactId>
            <version>2.3.1</version>
            <type>war</type>
        </dependency>
        <dependency>
            <groupId>org.eclipse.jetty</groupId>
            <artifactId>jetty-servlets</artifactId>
            <version>${eclipse.jetty.version}</version>
            <exclusions>
                <exclusion>
                    <groupId>org.eclipse.jetty</groupId>
                    <artifactId>jetty-client</artifactId>
                </exclusion>
            </exclusions>
        </dependency>


    6. in your web project, add the following to your web.xml
```xml
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


    7. wire your javascript client to talk to /service/force, e.g.
```javascript
        cometd.batch(function()
        {
            cometd.subscribe('/force', function(message)
            {
                $('#el').append('<pre>' + JSON.stringify(message, null, 4) + '</pre>');
            });
            cometd.publish('/service/force', { name: 'channelName' });
        });
