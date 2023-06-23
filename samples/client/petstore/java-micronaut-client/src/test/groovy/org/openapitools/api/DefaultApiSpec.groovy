package org.openapitools.api

import org.openapitools.model.Dummy200Response
import org.openapitools.model.ExampleResponse
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject
import spock.lang.Ignore
import java.util.Arrays
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.HashSet


/**
 * API tests for DefaultApi
 */
@MicronautTest
class DefaultApiSpec extends Specification {

    @Inject
    DefaultApi api

    
    /**
     * 
     *
     * dummy
     */
    @Ignore("Not Implemented")
    void 'dummy() test'() {
        given:

        when:
        Dummy200Response body = api.dummy().block()

        then:
        true
        // TODO: test validations
    }

    
}
