package org.openapitools.server.api;

import org.openapitools.server.model.Dummy200Response;
import org.openapitools.server.model.ExampleResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

public interface DefaultService extends Service { 

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void update(Routing.Rules rules) {
        rules.get("/example/someMethod", this::dummy);
    }


    /**
     * GET /example/someMethod.
     * @param request the server request
     * @param response the server response
     */
    void dummy(ServerRequest request, ServerResponse response);

}
