package org.openapitools.api

import org.openapitools.model.ExampleResponse
import org.openapitools.model.Node

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * dummy
     *
     * @return dummy (status code 200)
     *         or dummy (status code 201)
     * @see ExampleApi#dummy
     */
    fun dummy(): ExampleResponse
}
