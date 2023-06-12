package org.openapitools.api

import org.openapitools.model.ExampleResponse

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * get some object
     *
     * @return The response with results (status code 200)
     * @see ExampleApi#retrieveSomething
     */
    fun retrieveSomething(): ExampleResponse
}
