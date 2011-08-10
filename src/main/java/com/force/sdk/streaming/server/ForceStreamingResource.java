package com.force.sdk.streaming.server;

import org.cometd.bayeux.server.BayeuxServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author naamannewbold
 */
public class ForceStreamingResource extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(ForceStreamingResource.class);

    public void init() {
        LOGGER.debug("Starting ForceStreamingService...");
        BayeuxServer bayeux = (BayeuxServer)getServletContext().getAttribute(BayeuxServer.ATTRIBUTE);
        new ForceStreamingService(bayeux, getServletConfig());
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        LOGGER.error("ForceStreamingResource accessed directly.");
        throw new ServletException();
    }
}
