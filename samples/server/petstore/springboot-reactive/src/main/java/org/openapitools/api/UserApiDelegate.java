package org.openapitools.api;

import springfox.documentation.annotations.ApiIgnore;
import org.openapitools.model.CreateUsersWithArrayInput201Response;
import java.util.List;
import org.openapitools.model.Param0Def;
import org.openapitools.model.Param1Def;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link UserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface UserApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user/createWithArray : Creates list of users with given input array
     * 
     *
     * @param param1  (optional)
     * @param param2  (optional)
     * @return bar baz (status code 200)
     *         or foo bar (status code 201)
     * @see UserApi#createUsersWithArrayInput
     */
    default Mono<ResponseEntity<Flux<Param1Def>>> createUsersWithArrayInput(Param0Def param1,
        List<@Valid Param1Def> param2,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"myField\" : [ 0, 0 ] }, { \"myField\" : [ 0, 0 ] } ]";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

}
