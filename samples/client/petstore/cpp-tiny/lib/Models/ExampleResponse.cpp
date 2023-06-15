

#include "ExampleResponse.h"

using namespace Tiny;

ExampleResponse::ExampleResponse()
{
	emptyString = std::string();
	numberString = std::string();
	boolString = std::string();
	nullString = std::string();
	aBool = bool(false);
	zero = int(0);
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

    const char *emptyStringKey = "emptyString";

    if(object.has_key(emptyStringKey))
    {
        bourne::json value = object[emptyStringKey];



        jsonToValue(&emptyString, value, "std::string");


    }

    const char *numberStringKey = "numberString";

    if(object.has_key(numberStringKey))
    {
        bourne::json value = object[numberStringKey];



        jsonToValue(&numberString, value, "std::string");


    }

    const char *boolStringKey = "boolString";

    if(object.has_key(boolStringKey))
    {
        bourne::json value = object[boolStringKey];



        jsonToValue(&boolString, value, "std::string");


    }

    const char *nullStringKey = "nullString";

    if(object.has_key(nullStringKey))
    {
        bourne::json value = object[nullStringKey];



        jsonToValue(&nullString, value, "std::string");


    }

    const char *aBoolKey = "aBool";

    if(object.has_key(aBoolKey))
    {
        bourne::json value = object[aBoolKey];



        jsonToValue(&aBool, value, "bool");


    }

    const char *zeroKey = "zero";

    if(object.has_key(zeroKey))
    {
        bourne::json value = object[zeroKey];



        jsonToValue(&zero, value, "int");


    }


}

bourne::json
ExampleResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["emptyString"] = getEmptyString();






    object["numberString"] = getNumberString();






    object["boolString"] = getBoolString();






    object["nullString"] = getNullString();






    object["aBool"] = isABool();






    object["zero"] = getZero();



    return object;

}

std::string
ExampleResponse::getEmptyString()
{
	return emptyString;
}

void
ExampleResponse::setEmptyString(std::string  emptyString)
{
	this->emptyString = emptyString;
}

std::string
ExampleResponse::getNumberString()
{
	return numberString;
}

void
ExampleResponse::setNumberString(std::string  numberString)
{
	this->numberString = numberString;
}

std::string
ExampleResponse::getBoolString()
{
	return boolString;
}

void
ExampleResponse::setBoolString(std::string  boolString)
{
	this->boolString = boolString;
}

std::string
ExampleResponse::getNullString()
{
	return nullString;
}

void
ExampleResponse::setNullString(std::string  nullString)
{
	this->nullString = nullString;
}

bool
ExampleResponse::isABool()
{
	return aBool;
}

void
ExampleResponse::setABool(bool  aBool)
{
	this->aBool = aBool;
}

int
ExampleResponse::getZero()
{
	return zero;
}

void
ExampleResponse::setZero(int  zero)
{
	this->zero = zero;
}



