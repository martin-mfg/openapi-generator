#include "DefaultApi.h"

using namespace Tiny;



        Response<
            std::list<long>
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



            std::list<long> obj = std::list<long>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                long tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<long>> response(obj, httpCode);
            return response;
        }



