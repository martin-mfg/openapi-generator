

#include "ExampleResponse.h"

using namespace Tiny;

ExampleResponse::ExampleResponse()
{
	myOnlyProperty = OtherObject();
}

ExampleResponse::ExampleResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ExampleResponse::~ExampleResponse()
{

}

void
ExampleResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *myOnlyPropertyKey = "myOnlyProperty";

    if(object.has_key(myOnlyPropertyKey))
    {
        bourne::json value = object[myOnlyPropertyKey];




        OtherObject* obj = &myOnlyProperty;
		obj->fromJson(value.dump());

    }


}

bourne::json
ExampleResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["myOnlyProperty"] = getMyOnlyProperty().toJson();


    return object;

}

OtherObject
ExampleResponse::getMyOnlyProperty()
{
	return myOnlyProperty;
}

void
ExampleResponse::setMyOnlyProperty(OtherObject  myOnlyProperty)
{
	this->myOnlyProperty = myOnlyProperty;
}



