package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Dummy200Response;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }

    /**
     * 
     *
     * dummy
     */
    @Test
    public void dummyTest() {
        // Dummy200Response response = api.dummy();

        // TODO: test validations
    }
}
