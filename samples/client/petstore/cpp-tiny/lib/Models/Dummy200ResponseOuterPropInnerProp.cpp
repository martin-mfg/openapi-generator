

#include "Dummy_200_response_outerProp_innerProp.h"

using namespace Tiny;

Dummy_200_response_outerProp_innerProp::Dummy_200_response_outerProp_innerProp()
{
	myBool = bool(false);
}

Dummy_200_response_outerProp_innerProp::Dummy_200_response_outerProp_innerProp(std::string jsonString)
{
	this->fromJson(jsonString);
}

Dummy_200_response_outerProp_innerProp::~Dummy_200_response_outerProp_innerProp()
{

}

void
Dummy_200_response_outerProp_innerProp::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *myBoolKey = "myBool";

    if(object.has_key(myBoolKey))
    {
        bourne::json value = object[myBoolKey];



        jsonToValue(&myBool, value, "bool");


    }


}

bourne::json
Dummy_200_response_outerProp_innerProp::toJson()
{
    bourne::json object = bourne::json::object();





    object["myBool"] = isMyBool();



    return object;

}

bool
Dummy_200_response_outerProp_innerProp::isMyBool()
{
	return myBool;
}

void
Dummy_200_response_outerProp_innerProp::setMyBool(bool  myBool)
{
	this->myBool = myBool;
}



