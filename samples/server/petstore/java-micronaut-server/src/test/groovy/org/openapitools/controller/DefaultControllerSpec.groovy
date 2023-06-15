package org.openapitools.controller

import org.openapitools.model.ExampleResponse
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.http.HttpStatus
import io.micronaut.http.HttpRequest
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.uri.UriTemplate
import io.micronaut.http.cookie.Cookie
import io.micronaut.http.client.multipart.MultipartBody
import io.micronaut.core.type.Argument
import jakarta.inject.Inject
import spock.lang.Specification
import spock.lang.Ignore
import reactor.core.publisher.Mono
import java.io.File
import java.io.FileReader


/**
 * Controller tests for DefaultController
 */
@MicronautTest
class DefaultControllerSpec extends Specification {

    @Inject
    EmbeddedServer server

    @Inject
    @Client
    HttpClient client

    @Inject
    DefaultController controller

    /**
     * This test is used to validate the implementation of exampleSomeMethodGet() method
     *
     * The method should: 
     *
     * 
     *
     * TODO fill in the parameters and test return value.
     */
    @Ignore("Not Implemented")
    def 'exampleSomeMethodGet() method test'() {
        given:

        when:
        ExampleResponse result = controller.exampleSomeMethodGet().block()

        then:
        true
    }

    /**
     * This test is used to check that the api available to client through
     * '/example/someMethod' to the features of exampleSomeMethodGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Ignore("Not Implemented")
    def 'exampleSomeMethodGet() test with client through path /example/someMethod'() {
        given:
        var uri = UriTemplate.of('/example/someMethod').expand([:])
        MutableHttpRequest request = HttpRequest.GET(uri)
            .accept('/')

        when:
        HttpResponse response = client.toBlocking().exchange(request, ExampleResponse.class);

        then:
        response.status() == HttpStatus.OK
    }

}
