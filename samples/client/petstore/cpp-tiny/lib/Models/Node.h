
/*
 * Node.h
 *
 * dummy
 */

#ifndef TINY_CPP_CLIENT_Node_H_
#define TINY_CPP_CLIENT_Node_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief dummy
 *
 *  \ingroup Models
 *
 */

class Node{
public:

    /*! \brief Constructor.
	 */
    Node();
    Node(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Node();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Node getLeft();

	/*! \brief Set 
	 */
	void setLeft(Node  left);
	/*! \brief Get 
	 */
	Node getRight();

	/*! \brief Set 
	 */
	void setRight(Node  right);


    private:
    Node left;
    Node right;
};
}

#endif /* TINY_CPP_CLIENT_Node_H_ */
