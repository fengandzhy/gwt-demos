package org.frank.helloWorld.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.frank.helloWorld.client.HelloWorldService;

public class HelloWorldServiceImpl extends RemoteServiceServlet implements HelloWorldService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}