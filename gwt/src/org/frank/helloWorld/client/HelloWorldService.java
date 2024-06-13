package org.frank.helloWorld.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("hello-world-service")
public interface HelloWorldService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use HelloWorldService.App.getInstance() to access static instance of HelloWorldServiceAsync
     */
    class App {
        private static HelloWorldServiceAsync ourInstance = GWT.create(HelloWorldService.class);

        public static synchronized HelloWorldServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
