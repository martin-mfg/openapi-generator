@isTest
private class OASDefaultApiTest {
    /**
     * 
     *
     * dummy
     */
    @isTest
    private static void dummyTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDefaultApi api;
        OASDummy200Response response;
        OASDummy200Response expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASDummy200Response.getExample());
        res.setHeader('Content-Type', '*/*');
        res.setBody(js);
        expectedResponse = OASDummy200Response.getExample();
        response = (OASDummy200Response) api.dummy();
        System.assertEquals(expectedResponse, response);
    }
}