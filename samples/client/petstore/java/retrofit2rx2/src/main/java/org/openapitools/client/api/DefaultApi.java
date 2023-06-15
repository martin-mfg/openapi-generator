package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.ExampleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DefaultApi {
  /**
   * 
   * dummy
   * @return Observable&lt;ExampleResponse&gt;
   */
  @GET("example/someMethod")
  Observable<ExampleResponse> dummy();
    

}
