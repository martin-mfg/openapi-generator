#include "DefaultApi.h"

using namespace Tiny;



        Response<
            Dummy_200_response
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




            Dummy_200_response obj(output_string);


            Response<Dummy_200_response> response(obj, httpCode);
            return response;
        }



