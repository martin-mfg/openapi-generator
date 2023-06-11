package org.openapitools.api

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
     * get some object
     */
    @Ignore("Not Implemented")
    void 'retrieveSomething() test'() {
        given:

        when:
        ExampleResponse body = api.retrieveSomething().block()

        then:
        true
        // TODO: test validations
    }

    
}
