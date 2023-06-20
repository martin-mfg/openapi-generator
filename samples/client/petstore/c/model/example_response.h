/*
 * example_response.h
 *
 * dummy
 */

#ifndef _example_response_H_
#define _example_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct example_response_t example_response_t;

#include "set.h"



typedef struct example_response_t {
    set_t *my_only_property; //primitive container

} example_response_t;

example_response_t *example_response_create(
    set_t *my_only_property
);

void example_response_free(example_response_t *example_response);

example_response_t *example_response_parseFromJSON(cJSON *example_responseJSON);

cJSON *example_response_convertToJSON(example_response_t *example_response);

#endif /* _example_response_H_ */

