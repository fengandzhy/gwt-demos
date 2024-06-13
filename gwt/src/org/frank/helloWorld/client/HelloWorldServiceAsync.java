package org.frank.helloWorld.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloWorldServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
