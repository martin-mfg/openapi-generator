package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import okhttp3.RequestBody
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.Completable
import com.squareup.moshi.Json

import org.openapitools.client.models.ExampleResponse

interface DefaultApi {
    /**
     * 
     * get some object
     * Responses:
     *  - 200: The response with results
     *
     * @return [Call]<[ExampleResponse]>
     */
    @GET("example/someMethod")
    fun retrieveSomething(): Single<ExampleResponse>

}
