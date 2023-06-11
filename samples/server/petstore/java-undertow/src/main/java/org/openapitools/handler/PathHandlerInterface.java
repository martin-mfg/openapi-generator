/*
 * Some example
 *
 * dummy description
 *
 * OpenAPI document version: 0.0.1
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>get some object</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/example/someMethod" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ExampleResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The response with results</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveSomething();
}
