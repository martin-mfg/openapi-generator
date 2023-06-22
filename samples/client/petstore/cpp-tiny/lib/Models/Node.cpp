

#include "Node.h"

using namespace Tiny;

Node::Node()
{
	left = Node();
	right = Node();
}

Node::Node(std::string jsonString)
{
	this->fromJson(jsonString);
}

Node::~Node()
{

}

void
Node::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *leftKey = "left";

    if(object.has_key(leftKey))
    {
        bourne::json value = object[leftKey];




        Node* obj = &left;
		obj->fromJson(value.dump());

    }

    const char *rightKey = "right";

    if(object.has_key(rightKey))
    {
        bourne::json value = object[rightKey];




        Node* obj = &right;
		obj->fromJson(value.dump());

    }


}

bourne::json
Node::toJson()
{
    bourne::json object = bourne::json::object();






	object["left"] = getLeft().toJson();






	object["right"] = getRight().toJson();


    return object;

}

Node
Node::getLeft()
{
	return left;
}

void
Node::setLeft(Node  left)
{
	this->left = left;
}

Node
Node::getRight()
{
	return right;
}

void
Node::setRight(Node  right)
{
	this->right = right;
}



