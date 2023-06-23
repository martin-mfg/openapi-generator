package org.openapitools.api

import org.openapitools.model.Dummy200Response
import org.openapitools.model.ExampleResponse

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * dummy
     *
     * @return dummy (status code 201)
     *         or dummy (status code 200)
     * @see ExampleApi#dummy
     */
    fun dummy(): Dummy200Response
}
