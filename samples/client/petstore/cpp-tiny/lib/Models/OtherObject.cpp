

#include "OtherObject.h"

using namespace Tiny;

OtherObject::OtherObject()
{
	myOnlyProperty2 = ExampleResponse();
}

OtherObject::OtherObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

OtherObject::~OtherObject()
{

}

void
OtherObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *myOnlyProperty2Key = "myOnlyProperty2";

    if(object.has_key(myOnlyProperty2Key))
    {
        bourne::json value = object[myOnlyProperty2Key];




        ExampleResponse* obj = &myOnlyProperty2;
		obj->fromJson(value.dump());

    }


}

bourne::json
OtherObject::toJson()
{
    bourne::json object = bourne::json::object();






	object["myOnlyProperty2"] = getMyOnlyProperty2().toJson();


    return object;

}

ExampleResponse
OtherObject::getMyOnlyProperty2()
{
	return myOnlyProperty2;
}

void
OtherObject::setMyOnlyProperty2(ExampleResponse  myOnlyProperty2)
{
	this->myOnlyProperty2 = myOnlyProperty2;
}



