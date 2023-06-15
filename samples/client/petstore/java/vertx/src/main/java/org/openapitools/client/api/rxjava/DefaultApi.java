package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.ExampleResponse;
import org.openapitools.client.ApiClient;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultApi {

    private final org.openapitools.client.api.DefaultApi delegate;

    public DefaultApi(org.openapitools.client.api.DefaultApi delegate) {
        this.delegate = delegate;
    }

    public org.openapitools.client.api.DefaultApi getDelegate() {
        return delegate;
    }

    /**
    * 
    * 
    * @param resultHandler Asynchronous result handler
    */
    public void exampleSomeMethodGet(Handler<AsyncResult<ExampleResponse>> resultHandler) {
        delegate.exampleSomeMethodGet(resultHandler);
    }

    /**
    * 
    * 
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void exampleSomeMethodGet(ApiClient.AuthInfo authInfo, Handler<AsyncResult<ExampleResponse>> resultHandler) {
        delegate.exampleSomeMethodGet(authInfo, resultHandler);
    }

    /**
    * 
    * 
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ExampleResponse> rxExampleSomeMethodGet() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.exampleSomeMethodGet(fut)
        ));
    }

    /**
    * 
    * 
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<ExampleResponse> rxExampleSomeMethodGet(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.exampleSomeMethodGet(authInfo, fut)
        ));
    }

    public static DefaultApi newInstance(org.openapitools.client.api.DefaultApi arg) {
        return arg != null ? new DefaultApi(arg) : null;
    }
}
