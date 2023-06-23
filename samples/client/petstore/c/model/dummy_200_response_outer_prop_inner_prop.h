/*
 * dummy_200_response_outer_prop_inner_prop.h
 *
 * 
 */

#ifndef _dummy_200_response_outer_prop_inner_prop_H_
#define _dummy_200_response_outer_prop_inner_prop_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dummy_200_response_outer_prop_inner_prop_t dummy_200_response_outer_prop_inner_prop_t;




typedef struct dummy_200_response_outer_prop_inner_prop_t {
    int my_bool; //boolean

} dummy_200_response_outer_prop_inner_prop_t;

dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop_create(
    int my_bool
);

void dummy_200_response_outer_prop_inner_prop_free(dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop);

dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop_parseFromJSON(cJSON *dummy_200_response_outer_prop_inner_propJSON);

cJSON *dummy_200_response_outer_prop_inner_prop_convertToJSON(dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop);

#endif /* _dummy_200_response_outer_prop_inner_prop_H_ */

