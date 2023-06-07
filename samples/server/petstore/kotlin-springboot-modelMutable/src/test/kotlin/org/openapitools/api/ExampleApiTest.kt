package org.openapitools.api

import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ExampleApiTest {

    private val service: ExampleApiService = ExampleApiServiceImpl()
    private val api: ExampleApiController = ExampleApiController(service)

    /**
     * To test ExampleApiController.retrieveSomething
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveSomethingTest() {
        val response: ResponseEntity<List<java.math.BigDecimal>> = api.retrieveSomething()

        // TODO: test validations
    }
}
