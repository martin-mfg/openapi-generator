package org.openapitools.api

import org.openapitools.model.ExampleResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ExampleApiTest {

    private val service: ExampleApiService = ExampleApiServiceImpl()
    private val api: ExampleApiController = ExampleApiController(service)

    /**
     * To test ExampleApiController.exampleSomeMethodGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun exampleSomeMethodGetTest() {
        val response: ResponseEntity<ExampleResponse> = api.exampleSomeMethodGet()

        // TODO: test validations
    }
}
