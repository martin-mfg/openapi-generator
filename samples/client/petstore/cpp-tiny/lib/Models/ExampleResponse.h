
/*
 * ExampleResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ExampleResponse_H_
#define TINY_CPP_CLIENT_ExampleResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
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
	std::list<bool> getMyOnlyProperty();

	/*! \brief Set 
	 */
	void setMyOnlyProperty(std::list <bool> myOnlyProperty);


    private:
    std::list<bool> myOnlyProperty;
};
}

#endif /* TINY_CPP_CLIENT_ExampleResponse_H_ */
