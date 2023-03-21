package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.util.Map;
import org.openapitools.model.ModelApiResponse;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link FakeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface FakeApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /fake/create_xml_item : creates an XmlItem
     * this route creates an XmlItem
     *
     * @param xmlItem XmlItem Body (required)
     * @return successful operation (status code 200)
     * @see FakeApi#createXmlItem
     */
    default Void createXmlItem(XmlItem xmlItem) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * POST /fake/outer/boolean
     * Test serialization of outer boolean types
     *
     * @param body Input boolean as post body (optional)
     * @return Output boolean (status code 200)
     * @see FakeApi#fakeOuterBooleanSerialize
     */
    default Boolean fakeOuterBooleanSerialize(Boolean body) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * POST /fake/outer/composite
     * Test serialization of object with outer number type
     *
     * @param body Input composite as post body (optional)
     * @return Output composite (status code 200)
     * @see FakeApi#fakeOuterCompositeSerialize
     */
    default OuterComposite fakeOuterCompositeSerialize(OuterComposite body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"my_string\" : \"my_string\", \"my_number\" : 0.8008281904610115, \"my_boolean\" : true }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * POST /fake/outer/number
     * Test serialization of outer number types
     *
     * @param body Input number as post body (optional)
     * @return Output number (status code 200)
     * @see FakeApi#fakeOuterNumberSerialize
     */
    default BigDecimal fakeOuterNumberSerialize(BigDecimal body) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * POST /fake/outer/string
     * Test serialization of outer string types
     *
     * @param body Input string as post body (optional)
     * @return Output string (status code 200)
     * @see FakeApi#fakeOuterStringSerialize
     */
    default String fakeOuterStringSerialize(String body) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * PUT /fake/body-with-file-schema
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param body  (required)
     * @return Success (status code 200)
     * @see FakeApi#testBodyWithFileSchema
     */
    default Void testBodyWithFileSchema(FileSchemaTestClass body) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * PUT /fake/body-with-query-params
     *
     * @param query  (required)
     * @param body  (required)
     * @return Success (status code 200)
     * @see FakeApi#testBodyWithQueryParams
     */
    default Void testBodyWithQueryParams(String query,
        User body) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * PATCH /fake : To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     * @see FakeApi#testClientModel
     */
    default Client testClientModel(Client body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"client\" : \"client\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * POST /fake : Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param _float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     * @see FakeApi#testEndpointParameters
     */
    default Void testEndpointParameters(BigDecimal number,
        Double _double,
        String patternWithoutDelimiter,
        byte[] _byte,
        Integer integer,
        Integer int32,
        Long int64,
        Float _float,
        String string,
        MultipartFile binary,
        LocalDate date,
        OffsetDateTime dateTime,
        String password,
        String paramCallback) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * GET /fake : To test enum parameters
     * To test enum parameters
     *
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @return Invalid request (status code 400)
     *         or Not found (status code 404)
     * @see FakeApi#testEnumParameters
     */
    default Void testEnumParameters(List<String> enumHeaderStringArray,
        String enumHeaderString,
        List<String> enumQueryStringArray,
        String enumQueryString,
        Integer enumQueryInteger,
        Double enumQueryDouble,
        List<String> enumFormStringArray,
        String enumFormString) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * DELETE /fake : Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param requiredStringGroup Required String in group parameters (required)
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     * @return Something wrong (status code 400)
     * @see FakeApi#testGroupParameters
     */
    default Void testGroupParameters(Integer requiredStringGroup,
        Boolean requiredBooleanGroup,
        Long requiredInt64Group,
        Integer stringGroup,
        Boolean booleanGroup,
        Long int64Group) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * POST /fake/inline-additionalProperties : test inline additionalProperties
     *
     * @param param request body (required)
     * @return successful operation (status code 200)
     * @see FakeApi#testInlineAdditionalProperties
     */
    default Void testInlineAdditionalProperties(Map<String, String> param) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * GET /fake/jsonFormData : test json serialization of form data
     *
     * @param param field1 (required)
     * @param param2 field2 (required)
     * @return successful operation (status code 200)
     * @see FakeApi#testJsonFormData
     */
    default Void testJsonFormData(String param,
        String param2) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * PUT /fake/test-query-parameters
     * To test the collection format in query parameters
     *
     * @param pipe  (required)
     * @param ioutil  (required)
     * @param http  (required)
     * @param url  (required)
     * @param context  (required)
     * @return Success (status code 200)
     * @see FakeApi#testQueryParameterCollectionFormat
     */
    default Void testQueryParameterCollectionFormat(List<String> pipe,
        List<String> ioutil,
        List<String> http,
        List<String> url,
        List<String> context) {
        throw new IllegalArgumentException("Not implemented");

    }

    /**
     * POST /fake/{petId}/uploadImageWithRequiredFile : uploads an image (required)
     *
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return successful operation (status code 200)
     * @see FakeApi#uploadFileWithRequiredFile
     */
    default ModelApiResponse uploadFileWithRequiredFile(Long petId,
        MultipartFile requiredFile,
        String additionalMetadata) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        throw new IllegalArgumentException("Not implemented");

    }

}
