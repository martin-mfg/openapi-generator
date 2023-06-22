package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

import org.openapitools.client.models.ExampleResponse
import org.openapitools.client.models.Node

interface DefaultApi {
    /**
     * 
     * dummy
     * Responses:
     *  - 200: dummy
     *  - 201: dummy
     *
     * @return [Call]<[ExampleResponse]>
     */
    @GET("example/someMethod")
    fun dummy(): Call<ExampleResponse>

}
