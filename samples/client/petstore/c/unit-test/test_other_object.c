#ifndef other_object_TEST
#define other_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define other_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/other_object.h"
other_object_t* instantiate_other_object(int include_optional);

#include "test_example_response.c"


other_object_t* instantiate_other_object(int include_optional) {
  other_object_t* other_object = NULL;
  if (include_optional) {
    other_object = other_object_create(
       // false, not to have infinite recursion
      instantiate_example_response(0)
    );
  } else {
    other_object = other_object_create(
      NULL
    );
  }

  return other_object;
}


#ifdef other_object_MAIN

void test_other_object(int include_optional) {
    other_object_t* other_object_1 = instantiate_other_object(include_optional);

	cJSON* jsonother_object_1 = other_object_convertToJSON(other_object_1);
	printf("other_object :\n%s\n", cJSON_Print(jsonother_object_1));
	other_object_t* other_object_2 = other_object_parseFromJSON(jsonother_object_1);
	cJSON* jsonother_object_2 = other_object_convertToJSON(other_object_2);
	printf("repeating other_object:\n%s\n", cJSON_Print(jsonother_object_2));
}

int main() {
  test_other_object(1);
  test_other_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // other_object_MAIN
#endif // other_object_TEST
