package org.openapitools.api

import org.openapitools.model.ExampleResponse
import org.openapitools.model.Node
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
@Service
class ExampleApiServiceImpl : ExampleApiService {

    override suspend fun dummy(): ExampleResponse {
        TODO("Implement me")
    }
}
