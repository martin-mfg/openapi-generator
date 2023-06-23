#ifndef dummy_200_response_outer_prop_TEST
#define dummy_200_response_outer_prop_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define dummy_200_response_outer_prop_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/dummy_200_response_outer_prop.h"
dummy_200_response_outer_prop_t* instantiate_dummy_200_response_outer_prop(int include_optional);

#include "test_dummy_200_response_outer_prop_inner_prop.c"


dummy_200_response_outer_prop_t* instantiate_dummy_200_response_outer_prop(int include_optional) {
  dummy_200_response_outer_prop_t* dummy_200_response_outer_prop = NULL;
  if (include_optional) {
    dummy_200_response_outer_prop = dummy_200_response_outer_prop_create(
       // false, not to have infinite recursion
      instantiate_dummy_200_response_outer_prop_inner_prop(0)
    );
  } else {
    dummy_200_response_outer_prop = dummy_200_response_outer_prop_create(
      NULL
    );
  }

  return dummy_200_response_outer_prop;
}


#ifdef dummy_200_response_outer_prop_MAIN

void test_dummy_200_response_outer_prop(int include_optional) {
    dummy_200_response_outer_prop_t* dummy_200_response_outer_prop_1 = instantiate_dummy_200_response_outer_prop(include_optional);

	cJSON* jsondummy_200_response_outer_prop_1 = dummy_200_response_outer_prop_convertToJSON(dummy_200_response_outer_prop_1);
	printf("dummy_200_response_outer_prop :\n%s\n", cJSON_Print(jsondummy_200_response_outer_prop_1));
	dummy_200_response_outer_prop_t* dummy_200_response_outer_prop_2 = dummy_200_response_outer_prop_parseFromJSON(jsondummy_200_response_outer_prop_1);
	cJSON* jsondummy_200_response_outer_prop_2 = dummy_200_response_outer_prop_convertToJSON(dummy_200_response_outer_prop_2);
	printf("repeating dummy_200_response_outer_prop:\n%s\n", cJSON_Print(jsondummy_200_response_outer_prop_2));
}

int main() {
  test_dummy_200_response_outer_prop(1);
  test_dummy_200_response_outer_prop(0);

  printf("Hello world \n");
  return 0;
}

#endif // dummy_200_response_outer_prop_MAIN
#endif // dummy_200_response_outer_prop_TEST
