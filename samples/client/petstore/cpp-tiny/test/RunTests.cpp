
#include "ExampleResponseTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test_ExampleResponse_emptyString_is_assigned_from_json);
    
    
    RUN_TEST(test_ExampleResponse_numberString_is_assigned_from_json);
    
    
    RUN_TEST(test_ExampleResponse_boolString_is_assigned_from_json);
    
    
    RUN_TEST(test_ExampleResponse_nullString_is_assigned_from_json);
    
    
    RUN_TEST(test_ExampleResponse_aBool_is_assigned_from_json);
    
    
    RUN_TEST(test_ExampleResponse_zero_is_assigned_from_json);
    
    

    
    
    RUN_TEST(test_ExampleResponse_emptyString_is_converted_to_json);
    
    
    RUN_TEST(test_ExampleResponse_numberString_is_converted_to_json);
    
    
    RUN_TEST(test_ExampleResponse_boolString_is_converted_to_json);
    
    
    RUN_TEST(test_ExampleResponse_nullString_is_converted_to_json);
    
    
    RUN_TEST(test_ExampleResponse_aBool_is_converted_to_json);
    
    
    RUN_TEST(test_ExampleResponse_zero_is_converted_to_json);
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
