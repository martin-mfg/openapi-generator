
#include "Dummy_200_response_outerProp_innerProp.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Dummy_200_response_outerProp_innerProp_myBool_is_assigned_from_json()
{




    bourne::json input =
    {
        "myBool", true
    };

    Dummy_200_response_outerProp_innerProp obj(input.dump());

    TEST_ASSERT(true == obj.isMyBool());




}



void test_Dummy_200_response_outerProp_innerProp_myBool_is_converted_to_json()
{


    bourne::json input =
    {
        "myBool", true
    };

    Dummy_200_response_outerProp_innerProp obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["myBool"] == output["myBool"]);


}


