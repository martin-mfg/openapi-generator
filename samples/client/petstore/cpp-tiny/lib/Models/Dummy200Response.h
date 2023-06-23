
/*
 * Dummy_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Dummy_200_response_H_
#define TINY_CPP_CLIENT_Dummy_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Dummy_200_response_outerProp.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Dummy_200_response{
public:

    /*! \brief Constructor.
	 */
    Dummy_200_response();
    Dummy_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Dummy_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Dummy_200_response_outerProp getOuterProp();

	/*! \brief Set 
	 */
	void setOuterProp(Dummy_200_response_outerProp  outerProp);


    private:
    Dummy_200_response_outerProp outerProp;
};
}

#endif /* TINY_CPP_CLIENT_Dummy_200_response_H_ */
