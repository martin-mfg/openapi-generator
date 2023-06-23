package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Dummy200Response;
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
    * dummy
    * @param resultHandler Asynchronous result handler
    */
    public void dummy(Handler<AsyncResult<Dummy200Response>> resultHandler) {
        delegate.dummy(resultHandler);
    }

    /**
    * 
    * dummy
    * @param authInfo call specific auth overrides
    * @param resultHandler Asynchronous result handler
    */
    public void dummy(ApiClient.AuthInfo authInfo, Handler<AsyncResult<Dummy200Response>> resultHandler) {
        delegate.dummy(authInfo, resultHandler);
    }

    /**
    * 
    * dummy
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Dummy200Response> rxDummy() {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.dummy(fut)
        ));
    }

    /**
    * 
    * dummy
    * @param authInfo call specific auth overrides
    * @return Asynchronous result handler (RxJava Single)
    */
    public Single<Dummy200Response> rxDummy(ApiClient.AuthInfo authInfo) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut ->
            delegate.dummy(authInfo, fut)
        ));
    }

    public static DefaultApi newInstance(org.openapitools.client.api.DefaultApi arg) {
        return arg != null ? new DefaultApi(arg) : null;
    }
}
