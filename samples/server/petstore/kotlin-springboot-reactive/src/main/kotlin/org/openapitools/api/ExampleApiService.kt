package org.openapitools.api

import org.openapitools.model.ExampleResponse
import org.openapitools.model.Node
import kotlinx.coroutines.flow.Flow

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * dummy
     *
     * @return dummy (status code 200)
     *         or dummy (status code 201)
     * @see ExampleApi#dummy
     */
    suspend fun dummy(): ExampleResponse
}
