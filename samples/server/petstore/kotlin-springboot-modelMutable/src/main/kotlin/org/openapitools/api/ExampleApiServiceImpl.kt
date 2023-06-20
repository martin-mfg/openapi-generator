package org.openapitools.api

import org.openapitools.model.ExampleResponse
import org.springframework.stereotype.Service
@Service
class ExampleApiServiceImpl : ExampleApiService {

    override fun dummy(): ExampleResponse {
        TODO("Implement me")
    }
}
