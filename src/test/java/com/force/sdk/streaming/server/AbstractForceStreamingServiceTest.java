package com.force.sdk.streaming.server;

import org.cometd.server.BayeuxServerImpl;
import org.cometd.server.CometdServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.testng.annotations.BeforeClass;

/**
 * Bootstraps ForceStreamingService on Jetty
 * Based on CometD's test server:
 * https://github.com/cometd/cometd/blob/master/cometd-java/cometd-java-server/src/test/java/org/cometd/server/AbstractBayeuxServerTest.java
 * @author naamannewbold
 */
public abstract class AbstractForceStreamingServiceTest {

    static final int PORT = Integer.valueOf(System.getenv("TEST_PORT"));

    BayeuxServerImpl bayeux;

    @BeforeClass
    public void embedForceStreamingServer() throws Exception {
        Server jetty = new Server(PORT);
        SelectChannelConnector connector = new SelectChannelConnector();
        jetty.addConnector(connector);

        HandlerCollection handlers = new HandlerCollection();
        jetty.setHandler(handlers);
        ServletContextHandler context = new ServletContextHandler(handlers, "/cometd", ServletContextHandler.SESSIONS);

        CometdServlet cometd = new CometdServlet();
        ServletHolder cometdServletHolder = new ServletHolder(cometd);
        context.addServlet(cometdServletHolder, "/cometd/*");
        context.addServlet(ForceStreamingResource.class, "/forcestream/*");

        jetty.start();
        jetty.join();
        bayeux = cometd.getBayeux();
    }
}
