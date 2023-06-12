package org.openapitools.api

import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
@Service
class ExampleApiServiceImpl : ExampleApiService {

    override suspend fun retrieveSomething(): kotlin.Int {
        TODO("Implement me")
    }
}
