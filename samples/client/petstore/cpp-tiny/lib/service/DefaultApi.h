#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Dummy_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi() = default;

    /**
    * .
    *
    * dummy
    */
    Response<
                Dummy_200_response
        >
    dummy(
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */