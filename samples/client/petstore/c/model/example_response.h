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




typedef struct example_response_t {
    char *empty_string; // string
    char *number_string; // string
    char *bool_string; // string
    char *null_string; // string
    int a_bool; //boolean
    int zero; //numeric

} example_response_t;

example_response_t *example_response_create(
    char *empty_string,
    char *number_string,
    char *bool_string,
    char *null_string,
    int a_bool,
    int zero
);

void example_response_free(example_response_t *example_response);

example_response_t *example_response_parseFromJSON(cJSON *example_responseJSON);

cJSON *example_response_convertToJSON(example_response_t *example_response);

#endif /* _example_response_H_ */

