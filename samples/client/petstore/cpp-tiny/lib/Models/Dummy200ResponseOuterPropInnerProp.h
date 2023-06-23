
/*
 * Dummy_200_response_outerProp_innerProp.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Dummy_200_response_outerProp_innerProp_H_
#define TINY_CPP_CLIENT_Dummy_200_response_outerProp_innerProp_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Dummy_200_response_outerProp_innerProp{
public:

    /*! \brief Constructor.
	 */
    Dummy_200_response_outerProp_innerProp();
    Dummy_200_response_outerProp_innerProp(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Dummy_200_response_outerProp_innerProp();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isMyBool();

	/*! \brief Set 
	 */
	void setMyBool(bool  myBool);


    private:
    bool myBool{};
};
}

#endif /* TINY_CPP_CLIENT_Dummy_200_response_outerProp_innerProp_H_ */
