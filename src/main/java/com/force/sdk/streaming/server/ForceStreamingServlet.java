package com.force.sdk.streaming.server;

import org.cometd.bayeux.server.BayeuxServer;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author naamannewbold
 */
public class ForceStreamingServlet extends GenericServlet {

    public void init() throws ServletException {
        BayeuxServer bayeux = (BayeuxServer)getServletContext().getAttribute(BayeuxServer.ATTRIBUTE);
        new ForceStreamingService(bayeux, getServletConfig());
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        throw new ServletException();
    }
}
