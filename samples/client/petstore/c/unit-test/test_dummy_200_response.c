#ifndef dummy_200_response_TEST
#define dummy_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define dummy_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/dummy_200_response.h"
dummy_200_response_t* instantiate_dummy_200_response(int include_optional);

#include "test_dummy_200_response_outer_prop.c"


dummy_200_response_t* instantiate_dummy_200_response(int include_optional) {
  dummy_200_response_t* dummy_200_response = NULL;
  if (include_optional) {
    dummy_200_response = dummy_200_response_create(
       // false, not to have infinite recursion
      instantiate_dummy_200_response_outer_prop(0)
    );
  } else {
    dummy_200_response = dummy_200_response_create(
      NULL
    );
  }

  return dummy_200_response;
}


#ifdef dummy_200_response_MAIN

void test_dummy_200_response(int include_optional) {
    dummy_200_response_t* dummy_200_response_1 = instantiate_dummy_200_response(include_optional);

	cJSON* jsondummy_200_response_1 = dummy_200_response_convertToJSON(dummy_200_response_1);
	printf("dummy_200_response :\n%s\n", cJSON_Print(jsondummy_200_response_1));
	dummy_200_response_t* dummy_200_response_2 = dummy_200_response_parseFromJSON(jsondummy_200_response_1);
	cJSON* jsondummy_200_response_2 = dummy_200_response_convertToJSON(dummy_200_response_2);
	printf("repeating dummy_200_response:\n%s\n", cJSON_Print(jsondummy_200_response_2));
}

int main() {
  test_dummy_200_response(1);
  test_dummy_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // dummy_200_response_MAIN
#endif // dummy_200_response_TEST
