package org.openapitools.api

import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service
@Service
class ExampleApiServiceImpl : ExampleApiService {

    override fun retrieveSomething(): Flow<java.math.BigDecimal> {
        TODO("Implement me")
    }
}
