

#include "Dummy_200_response.h"

using namespace Tiny;

Dummy_200_response::Dummy_200_response()
{
	outerProp = Dummy_200_response_outerProp();
}

Dummy_200_response::Dummy_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Dummy_200_response::~Dummy_200_response()
{

}

void
Dummy_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *outerPropKey = "outerProp";

    if(object.has_key(outerPropKey))
    {
        bourne::json value = object[outerPropKey];




        Dummy_200_response_outerProp* obj = &outerProp;
		obj->fromJson(value.dump());

    }


}

bourne::json
Dummy_200_response::toJson()
{
    bourne::json object = bourne::json::object();






	object["outerProp"] = getOuterProp().toJson();


    return object;

}

Dummy_200_response_outerProp
Dummy_200_response::getOuterProp()
{
	return outerProp;
}

void
Dummy_200_response::setOuterProp(Dummy_200_response_outerProp  outerProp)
{
	this->outerProp = outerProp;
}



