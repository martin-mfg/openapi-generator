/*
 * dummy_200_response_outer_prop.h
 *
 * 
 */

#ifndef _dummy_200_response_outer_prop_H_
#define _dummy_200_response_outer_prop_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dummy_200_response_outer_prop_t dummy_200_response_outer_prop_t;

#include "dummy_200_response_outer_prop_inner_prop.h"



typedef struct dummy_200_response_outer_prop_t {
    struct dummy_200_response_outer_prop_inner_prop_t *inner_prop; //model

} dummy_200_response_outer_prop_t;

dummy_200_response_outer_prop_t *dummy_200_response_outer_prop_create(
    dummy_200_response_outer_prop_inner_prop_t *inner_prop
);

void dummy_200_response_outer_prop_free(dummy_200_response_outer_prop_t *dummy_200_response_outer_prop);

dummy_200_response_outer_prop_t *dummy_200_response_outer_prop_parseFromJSON(cJSON *dummy_200_response_outer_propJSON);

cJSON *dummy_200_response_outer_prop_convertToJSON(dummy_200_response_outer_prop_t *dummy_200_response_outer_prop);

#endif /* _dummy_200_response_outer_prop_H_ */

