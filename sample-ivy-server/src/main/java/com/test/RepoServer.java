package com.test;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

public final class RepoServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        // Create a resource handler for static content.
        ResourceHandler staticResourceHandler = new ResourceHandler();
        staticResourceHandler.setResourceBase("../repo");
        staticResourceHandler.setDirectoriesListed(true);

        // Create context handler for static resource handler.
        ContextHandler staticContextHandler = new ContextHandler();
        staticContextHandler.setContextPath("/repo");
        staticContextHandler.setHandler(staticResourceHandler);

        // Create a handler list to store our static and servlet context handlers.
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { staticResourceHandler, staticContextHandler });

        // Add the handlers to the server and start jetty.
        server.setHandler(handlers);
        server.start();
        server.join();
    }
}
