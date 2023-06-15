
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
	std::string getEmptyString();

	/*! \brief Set 
	 */
	void setEmptyString(std::string  emptyString);
	/*! \brief Get 
	 */
	std::string getNumberString();

	/*! \brief Set 
	 */
	void setNumberString(std::string  numberString);
	/*! \brief Get 
	 */
	std::string getBoolString();

	/*! \brief Set 
	 */
	void setBoolString(std::string  boolString);
	/*! \brief Get 
	 */
	std::string getNullString();

	/*! \brief Set 
	 */
	void setNullString(std::string  nullString);
	/*! \brief Get 
	 */
	bool isABool();

	/*! \brief Set 
	 */
	void setABool(bool  aBool);
	/*! \brief Get 
	 */
	int getZero();

	/*! \brief Set 
	 */
	void setZero(int  zero);


    private:
    std::string emptyString{};
    std::string numberString{};
    std::string boolString{};
    std::string nullString{};
    bool aBool{};
    int zero{};
};
}

#endif /* TINY_CPP_CLIENT_ExampleResponse_H_ */
