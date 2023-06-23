package org.openapitools.controller

import org.openapitools.model.Dummy200Response
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
     * This test is used to validate the implementation of dummy() method
     *
     * The method should: 
     *
     * dummy
     *
     * TODO fill in the parameters and test return value.
     */
    @Ignore("Not Implemented")
    def 'dummy() method test'() {
        given:

        when:
        Dummy200Response result = controller.dummy().block()

        then:
        true
    }

    /**
     * This test is used to check that the api available to client through
     * '/example/someMethod' to the features of dummy() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Ignore("Not Implemented")
    def 'dummy() test with client through path /example/someMethod'() {
        given:
        var uri = UriTemplate.of('/example/someMethod').expand([:])
        MutableHttpRequest request = HttpRequest.GET(uri)
            .accept('*/*')

        when:
        HttpResponse response = client.toBlocking().exchange(request, Dummy200Response.class);

        then:
        response.status() == HttpStatus.OK
    }

}
