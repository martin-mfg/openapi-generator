package org.openapitools.api

import org.openapitools.model.ExampleResponse
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
@Service
class ExampleApiServiceImpl : ExampleApiService {

    override suspend fun retrieveSomething(): ExampleResponse {
        TODO("Implement me")
    }
}
