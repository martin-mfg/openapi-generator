
/*
 * ExampleResponse.h
 *
 * dummy
 */

#ifndef TINY_CPP_CLIENT_ExampleResponse_H_
#define TINY_CPP_CLIENT_ExampleResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"

namespace Tiny {


/*! \brief dummy
 *
 *  \ingroup Models
 *
 */

class ExampleResponse{
public:

    /*! \brief Constructor.
	 */
    ExampleResponse();
    ExampleResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ExampleResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Set<long> getMyOnlyProperty();

	/*! \brief Set 
	 */
	void setMyOnlyProperty(Set <long> myOnlyProperty);


    private:
    Set<long> myOnlyProperty;
};
}

#endif /* TINY_CPP_CLIENT_ExampleResponse_H_ */
