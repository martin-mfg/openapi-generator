package org.openapitools.api

import kotlinx.coroutines.flow.Flow

interface ExampleApiService {

    /**
     * GET /example/someMethod
     * get some object
     *
     * @return The response with results (status code 200)
     * @see ExampleApi#retrieveSomething
     */
    fun retrieveSomething(): Flow<java.math.BigDecimal>
}
