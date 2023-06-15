
#include "ExampleResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ExampleResponse_emptyString_is_assigned_from_json()
{


    bourne::json input =
    {
        "emptyString", "hello"
    };

    ExampleResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEmptyString().c_str());






}


void test_ExampleResponse_numberString_is_assigned_from_json()
{


    bourne::json input =
    {
        "numberString", "hello"
    };

    ExampleResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNumberString().c_str());






}


void test_ExampleResponse_boolString_is_assigned_from_json()
{


    bourne::json input =
    {
        "boolString", "hello"
    };

    ExampleResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBoolString().c_str());






}


void test_ExampleResponse_nullString_is_assigned_from_json()
{


    bourne::json input =
    {
        "nullString", "hello"
    };

    ExampleResponse obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNullString().c_str());






}


void test_ExampleResponse_aBool_is_assigned_from_json()
{




    bourne::json input =
    {
        "aBool", true
    };

    ExampleResponse obj(input.dump());

    TEST_ASSERT(true == obj.isABool());




}


void test_ExampleResponse_zero_is_assigned_from_json()
{
    bourne::json input =
    {
        "zero", 1
    };

    ExampleResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getZero());








}



void test_ExampleResponse_emptyString_is_converted_to_json()
{

    bourne::json input =
    {
        "emptyString", "hello"
    };

    ExampleResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["emptyString"] == output["emptyString"]);



}


void test_ExampleResponse_numberString_is_converted_to_json()
{

    bourne::json input =
    {
        "numberString", "hello"
    };

    ExampleResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["numberString"] == output["numberString"]);



}


void test_ExampleResponse_boolString_is_converted_to_json()
{

    bourne::json input =
    {
        "boolString", "hello"
    };

    ExampleResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["boolString"] == output["boolString"]);



}


void test_ExampleResponse_nullString_is_converted_to_json()
{

    bourne::json input =
    {
        "nullString", "hello"
    };

    ExampleResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["nullString"] == output["nullString"]);



}


void test_ExampleResponse_aBool_is_converted_to_json()
{


    bourne::json input =
    {
        "aBool", true
    };

    ExampleResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["aBool"] == output["aBool"]);


}


void test_ExampleResponse_zero_is_converted_to_json()
{
    bourne::json input =
    {
        "zero", 1
    };

    ExampleResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["zero"] == output["zero"]);




}


