package com.force.sdk.streaming.server;

import com.force.sdk.streaming.client.ForceStreamingClientModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

/**
 * @author naamannewbold
 */
public class ForceStreamingContextListener extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ForceStreamingClientModule(), new JerseyServletModule() {
            @Override
            protected void configureServlets() {
                bind(PushTopicResource.class);
                bind(ForceStreamingResource.class);

                serve("/forcestream/*").with(GuiceContainer.class);
            }
        });
    }
}