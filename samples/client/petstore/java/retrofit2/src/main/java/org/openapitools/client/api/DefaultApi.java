package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DefaultApi {
  /**
   * 
   * get some object
   * @return Call&lt;List&lt;BigDecimal&gt;&gt;
   */
  @GET("example/someMethod")
  Call<List<BigDecimal>> retrieveSomething();
    

}
