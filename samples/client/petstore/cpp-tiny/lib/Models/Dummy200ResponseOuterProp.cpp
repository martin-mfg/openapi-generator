

#include "Dummy_200_response_outerProp.h"

using namespace Tiny;

Dummy_200_response_outerProp::Dummy_200_response_outerProp()
{
	innerProp = Dummy_200_response_outerProp_innerProp();
}

Dummy_200_response_outerProp::Dummy_200_response_outerProp(std::string jsonString)
{
	this->fromJson(jsonString);
}

Dummy_200_response_outerProp::~Dummy_200_response_outerProp()
{

}

void
Dummy_200_response_outerProp::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *innerPropKey = "innerProp";

    if(object.has_key(innerPropKey))
    {
        bourne::json value = object[innerPropKey];




        Dummy_200_response_outerProp_innerProp* obj = &innerProp;
		obj->fromJson(value.dump());

    }


}

bourne::json
Dummy_200_response_outerProp::toJson()
{
    bourne::json object = bourne::json::object();






	object["innerProp"] = getInnerProp().toJson();


    return object;

}

Dummy_200_response_outerProp_innerProp
Dummy_200_response_outerProp::getInnerProp()
{
	return innerProp;
}

void
Dummy_200_response_outerProp::setInnerProp(Dummy_200_response_outerProp_innerProp  innerProp)
{
	this->innerProp = innerProp;
}



