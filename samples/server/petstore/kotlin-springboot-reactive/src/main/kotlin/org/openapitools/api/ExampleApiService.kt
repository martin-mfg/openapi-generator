package org.openapitools.api

import org.openapitools.model.ExampleResponse
import kotlinx.coroutines.flow.Flow

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * dummy
     *
     * @return dummy (status code 200)
     * @see ExampleApi#dummy
     */
    suspend fun dummy(): ExampleResponse
}
