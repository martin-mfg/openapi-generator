package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


interface DefaultApi {
    /**
     * 
     * get some object
     * Responses:
     *  - 200: The response with results
     *
     * @return [Call]<[kotlin.collections.List<java.math.BigDecimal>]>
     */
    @GET("example/someMethod")
    fun retrieveSomething(): Call<kotlin.collections.List<java.math.BigDecimal>>

}
