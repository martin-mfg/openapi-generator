package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.Dummy200Response

interface DefaultApi {
    /**
     * 
     * dummy
     * Responses:
     *  - 200: dummy
     *
     * @return [Call]<[Dummy200Response]>
     */
    @GET("example/someMethod")
    fun dummy(): Call<Dummy200Response>

}
