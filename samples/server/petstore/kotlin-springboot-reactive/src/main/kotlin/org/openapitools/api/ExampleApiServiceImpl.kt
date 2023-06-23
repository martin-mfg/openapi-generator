package org.openapitools.api

import org.openapitools.model.Dummy200Response
import org.openapitools.model.ExampleResponse
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
@Service
class ExampleApiServiceImpl : ExampleApiService {

    override suspend fun dummy(): Dummy200Response {
        TODO("Implement me")
    }
}
