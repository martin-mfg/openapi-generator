package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import okhttp3.RequestBody
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.Completable
import com.squareup.moshi.Json


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
    fun retrieveSomething(): Single<kotlin.collections.List<java.math.BigDecimal>>

}
