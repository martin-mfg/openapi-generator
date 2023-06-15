package org.openapitools.api

import org.openapitools.model.ExampleResponse

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * 
     *
     * @return  (status code 200)
     * @see ExampleApi#exampleSomeMethodGet
     */
    fun exampleSomeMethodGet(): ExampleResponse
}
