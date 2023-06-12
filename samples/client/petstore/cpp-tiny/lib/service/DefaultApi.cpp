#include "DefaultApi.h"

using namespace Tiny;



        Response<
            int
        >
        DefaultApi::
        retrieveSomething(
        )
        {
            std::string url = basepath + "/example/someMethod"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            int obj;
            jsonToValue(&obj, jsonPayload, "int");



            Response<int> response(obj, httpCode);
            return response;
        }



