/*
 * dummy_200_response.h
 *
 * 
 */

#ifndef _dummy_200_response_H_
#define _dummy_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dummy_200_response_t dummy_200_response_t;

#include "dummy_200_response_outer_prop.h"



typedef struct dummy_200_response_t {
    struct dummy_200_response_outer_prop_t *outer_prop; //model

} dummy_200_response_t;

dummy_200_response_t *dummy_200_response_create(
    dummy_200_response_outer_prop_t *outer_prop
);

void dummy_200_response_free(dummy_200_response_t *dummy_200_response);

dummy_200_response_t *dummy_200_response_parseFromJSON(cJSON *dummy_200_responseJSON);

cJSON *dummy_200_response_convertToJSON(dummy_200_response_t *dummy_200_response);

#endif /* _dummy_200_response_H_ */

