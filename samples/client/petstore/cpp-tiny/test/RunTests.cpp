
#include "Dummy_200_responseTest.cpp"

#include "Dummy_200_response_outerPropTest.cpp"

#include "Dummy_200_response_outerProp_innerPropTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    
    
    
    
    RUN_TEST(test_Dummy_200_response_outerProp_innerProp_myBool_is_assigned_from_json);
    
    

    
    
    
    
    
    
    RUN_TEST(test_Dummy_200_response_outerProp_innerProp_myBool_is_converted_to_json);
    
    


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
