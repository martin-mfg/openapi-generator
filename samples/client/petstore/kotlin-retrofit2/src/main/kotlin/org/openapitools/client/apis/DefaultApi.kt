package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.ExampleResponse

interface DefaultApi {
    /**
     * 
     * 
     * Responses:
     *  - 200: 
     *
     * @return [Call]<[ExampleResponse]>
     */
    @GET("example/someMethod")
    fun exampleSomeMethodGet(): Call<ExampleResponse>

}
