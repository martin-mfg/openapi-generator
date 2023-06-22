#include "DefaultApi.h"

using namespace Tiny;



        Response<
            ExampleResponse
        >
        DefaultApi::
        dummy(
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




            ExampleResponse obj(output_string);


            Response<ExampleResponse> response(obj, httpCode);
            return response;
        }



