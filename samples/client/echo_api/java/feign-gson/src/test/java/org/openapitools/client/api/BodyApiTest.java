package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import java.io.File;
import org.openapitools.client.model.Pet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BodyApi
 */
class BodyApiTest {

    private BodyApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(BodyApi.class);
    }

    
    /**
     * Test binary (gif) response body
     *
     * Test binary (gif) response body
     */
    @Test
    void testBinaryGifTest() {
        // File response = api.testBinaryGif();

        // TODO: test validations
    }

    
    /**
     * Test body parameter(s)
     *
     * Test body parameter(s)
     */
    @Test
    void testEchoBodyPetTest() {
        Pet pet = null;
        // Pet response = api.testEchoBodyPet(pet);

        // TODO: test validations
    }

    
    /**
     * Test empty response body
     *
     * Test empty response body
     */
    @Test
    void testEchoBodyPetResponseStringTest() {
        Pet pet = null;
        // String response = api.testEchoBodyPetResponseString(pet);

        // TODO: test validations
    }

    
}
