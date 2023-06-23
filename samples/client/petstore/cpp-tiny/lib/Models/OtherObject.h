
/*
 * OtherObject.h
 *
 * dummy
 */

#ifndef TINY_CPP_CLIENT_OtherObject_H_
#define TINY_CPP_CLIENT_OtherObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ExampleResponse.h"

namespace Tiny {


/*! \brief dummy
 *
 *  \ingroup Models
 *
 */

class OtherObject{
public:

    /*! \brief Constructor.
	 */
    OtherObject();
    OtherObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OtherObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ExampleResponse getMyOnlyProperty2();

	/*! \brief Set 
	 */
	void setMyOnlyProperty2(ExampleResponse  myOnlyProperty2);


    private:
    ExampleResponse myOnlyProperty2;
};
}

#endif /* TINY_CPP_CLIENT_OtherObject_H_ */
