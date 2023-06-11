#ifndef example_response_TEST
#define example_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define example_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/example_response.h"
example_response_t* instantiate_example_response(int include_optional);



example_response_t* instantiate_example_response(int include_optional) {
  example_response_t* example_response = NULL;
  if (include_optional) {
    example_response = example_response_create(
      list_createList()
    );
  } else {
    example_response = example_response_create(
      list_createList()
    );
  }

  return example_response;
}


#ifdef example_response_MAIN

void test_example_response(int include_optional) {
    example_response_t* example_response_1 = instantiate_example_response(include_optional);

	cJSON* jsonexample_response_1 = example_response_convertToJSON(example_response_1);
	printf("example_response :\n%s\n", cJSON_Print(jsonexample_response_1));
	example_response_t* example_response_2 = example_response_parseFromJSON(jsonexample_response_1);
	cJSON* jsonexample_response_2 = example_response_convertToJSON(example_response_2);
	printf("repeating example_response:\n%s\n", cJSON_Print(jsonexample_response_2));
}

int main() {
  test_example_response(1);
  test_example_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // example_response_MAIN
#endif // example_response_TEST
