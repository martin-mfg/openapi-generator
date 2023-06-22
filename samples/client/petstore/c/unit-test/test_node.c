#ifndef node_TEST
#define node_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define node_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/node.h"
node_t* instantiate_node(int include_optional);

#include "test_node.c"
#include "test_node.c"


node_t* instantiate_node(int include_optional) {
  node_t* node = NULL;
  if (include_optional) {
    node = node_create(
       // false, not to have infinite recursion
      instantiate_node(0),
       // false, not to have infinite recursion
      instantiate_node(0)
    );
  } else {
    node = node_create(
      NULL,
      NULL
    );
  }

  return node;
}


#ifdef node_MAIN

void test_node(int include_optional) {
    node_t* node_1 = instantiate_node(include_optional);

	cJSON* jsonnode_1 = node_convertToJSON(node_1);
	printf("node :\n%s\n", cJSON_Print(jsonnode_1));
	node_t* node_2 = node_parseFromJSON(jsonnode_1);
	cJSON* jsonnode_2 = node_convertToJSON(node_2);
	printf("repeating node:\n%s\n", cJSON_Print(jsonnode_2));
}

int main() {
  test_node(1);
  test_node(0);

  printf("Hello world \n");
  return 0;
}

#endif // node_MAIN
#endif // node_TEST
