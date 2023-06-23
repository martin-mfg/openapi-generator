
/*
 * Dummy_200_response_outerProp.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Dummy_200_response_outerProp_H_
#define TINY_CPP_CLIENT_Dummy_200_response_outerProp_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Dummy_200_response_outerProp_innerProp.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Dummy_200_response_outerProp{
public:

    /*! \brief Constructor.
	 */
    Dummy_200_response_outerProp();
    Dummy_200_response_outerProp(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Dummy_200_response_outerProp();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Dummy_200_response_outerProp_innerProp getInnerProp();

	/*! \brief Set 
	 */
	void setInnerProp(Dummy_200_response_outerProp_innerProp  innerProp);


    private:
    Dummy_200_response_outerProp_innerProp innerProp;
};
}

#endif /* TINY_CPP_CLIENT_Dummy_200_response_outerProp_H_ */
