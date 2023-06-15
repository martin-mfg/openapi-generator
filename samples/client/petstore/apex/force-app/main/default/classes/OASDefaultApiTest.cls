@isTest
private class OASDefaultApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void exampleSomeMethodGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDefaultApi api;
        OASExampleResponse response;
        OASExampleResponse expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASExampleResponse.getExample());
        res.setHeader('Content-Type', '/');
        res.setBody(js);
        expectedResponse = OASExampleResponse.getExample();
        response = (OASExampleResponse) api.exampleSomeMethodGet();
        System.assertEquals(expectedResponse, response);
    }
}