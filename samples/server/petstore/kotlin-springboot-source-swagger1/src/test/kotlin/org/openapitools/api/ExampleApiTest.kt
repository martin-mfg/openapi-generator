package org.openapitools.api

import org.openapitools.model.Dummy200Response
import org.openapitools.model.ExampleResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ExampleApiTest {

    private val service: ExampleApiService = ExampleApiServiceImpl()
    private val api: ExampleApiController = ExampleApiController(service)

    /**
     * To test ExampleApiController.dummy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun dummyTest() {
        val response: ResponseEntity<Dummy200Response> = api.dummy()

        // TODO: test validations
    }
}
