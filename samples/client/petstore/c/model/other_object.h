/*
 * other_object.h
 *
 * dummy
 */

#ifndef _other_object_H_
#define _other_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct other_object_t other_object_t;

#include "example_response.h"



typedef struct other_object_t {
    struct example_response_t *my_only_property2; //model

} other_object_t;

other_object_t *other_object_create(
    example_response_t *my_only_property2
);

void other_object_free(other_object_t *other_object);

other_object_t *other_object_parseFromJSON(cJSON *other_objectJSON);

cJSON *other_object_convertToJSON(other_object_t *other_object);

#endif /* _other_object_H_ */

