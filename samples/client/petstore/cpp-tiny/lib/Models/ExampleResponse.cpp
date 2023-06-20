

#include "ExampleResponse.h"

using namespace Tiny;

ExampleResponse::ExampleResponse()
{
	myOnlyProperty = std::list<long>();
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


        std::list<long> myOnlyProperty_list;
        long element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "long");


            myOnlyProperty_list.push_back(element);
        }
        myOnlyProperty = myOnlyProperty_list;


    }


}

bourne::json
ExampleResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<long> myOnlyProperty_list = getMyOnlyProperty();
    bourne::json myOnlyProperty_arr = bourne::json::array();

    for(auto& var : myOnlyProperty_list)
    {
        myOnlyProperty_arr.append(var);
    }
    object["myOnlyProperty"] = myOnlyProperty_arr;






    return object;

}

Set<long>
ExampleResponse::getMyOnlyProperty()
{
	return myOnlyProperty;
}

void
ExampleResponse::setMyOnlyProperty(Set <long> myOnlyProperty)
{
	this->myOnlyProperty = myOnlyProperty;
}



