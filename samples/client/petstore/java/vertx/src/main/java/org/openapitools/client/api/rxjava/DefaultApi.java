package org.openapitools.client.api.rxjava;

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
    * get some object
    * @param resultHandler Asynchronous result handler
    */
    public void retrieveSomething(Handler<AsyncResult<Integer>> resultHandler) {
        delegate.retrieveSomething(resultHandler);
    }

    /**
    * 
    * get some object
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void retrieveSomething(ApiClient.AuthInfo authInfo, Handler<AsyncResult<Integer>> resultHandler) {
        delegate.retrieveSomething(authInfo, resultHandler);
    }

    /**
    * 
    * get some object
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Integer> rxRetrieveSomething() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.retrieveSomething(fut)
        ));
    }

    /**
    * 
    * get some object
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Integer> rxRetrieveSomething(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.retrieveSomething(authInfo, fut)
        ));
    }

    public static DefaultApi newInstance(org.openapitools.client.api.DefaultApi arg) {
        return arg != null ? new DefaultApi(arg) : null;
    }
}
