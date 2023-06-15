package org.openapitools.api

import org.openapitools.model.ExampleResponse
import kotlinx.coroutines.flow.Flow

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * 
     *
     * @return  (status code 200)
     * @see ExampleApi#exampleSomeMethodGet
     */
    suspend fun exampleSomeMethodGet(): ExampleResponse
}
