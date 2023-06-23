package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Dummy200Response;
import org.openapitools.client.model.ExampleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.*;
import retrofit2.Response;

public interface DefaultApi {
  /**
   * 
   * dummy
   * @return Call&lt;Dummy200Response&gt;
   */
  @GET("example/someMethod")
  CompletionStage<Response<Dummy200Response>> dummy();
    

}
