#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "example_response.h"



example_response_t *example_response_create(
    char *empty_string,
    char *number_string,
    char *bool_string,
    char *null_string,
    int a_bool,
    int zero
    ) {
    example_response_t *example_response_local_var = malloc(sizeof(example_response_t));
    if (!example_response_local_var) {
        return NULL;
    }
    example_response_local_var->empty_string = empty_string;
    example_response_local_var->number_string = number_string;
    example_response_local_var->bool_string = bool_string;
    example_response_local_var->null_string = null_string;
    example_response_local_var->a_bool = a_bool;
    example_response_local_var->zero = zero;

    return example_response_local_var;
}


void example_response_free(example_response_t *example_response) {
    if(NULL == example_response){
        return ;
    }
    listEntry_t *listEntry;
    if (example_response->empty_string) {
        free(example_response->empty_string);
        example_response->empty_string = NULL;
    }
    if (example_response->number_string) {
        free(example_response->number_string);
        example_response->number_string = NULL;
    }
    if (example_response->bool_string) {
        free(example_response->bool_string);
        example_response->bool_string = NULL;
    }
    if (example_response->null_string) {
        free(example_response->null_string);
        example_response->null_string = NULL;
    }
    free(example_response);
}

cJSON *example_response_convertToJSON(example_response_t *example_response) {
    cJSON *item = cJSON_CreateObject();

    // example_response->empty_string
    if(example_response->empty_string) {
    if(cJSON_AddStringToObject(item, "emptyString", example_response->empty_string) == NULL) {
    goto fail; //String
    }
    }


    // example_response->number_string
    if(example_response->number_string) {
    if(cJSON_AddStringToObject(item, "numberString", example_response->number_string) == NULL) {
    goto fail; //String
    }
    }


    // example_response->bool_string
    if(example_response->bool_string) {
    if(cJSON_AddStringToObject(item, "boolString", example_response->bool_string) == NULL) {
    goto fail; //String
    }
    }


    // example_response->null_string
    if(example_response->null_string) {
    if(cJSON_AddStringToObject(item, "nullString", example_response->null_string) == NULL) {
    goto fail; //String
    }
    }


    // example_response->a_bool
    if(example_response->a_bool) {
    if(cJSON_AddBoolToObject(item, "aBool", example_response->a_bool) == NULL) {
    goto fail; //Bool
    }
    }


    // example_response->zero
    if(example_response->zero) {
    if(cJSON_AddNumberToObject(item, "zero", example_response->zero) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

example_response_t *example_response_parseFromJSON(cJSON *example_responseJSON){

    example_response_t *example_response_local_var = NULL;

    // example_response->empty_string
    cJSON *empty_string = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "emptyString");
    if (empty_string) { 
    if(!cJSON_IsString(empty_string) && !cJSON_IsNull(empty_string))
    {
    goto end; //String
    }
    }

    // example_response->number_string
    cJSON *number_string = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "numberString");
    if (number_string) { 
    if(!cJSON_IsString(number_string) && !cJSON_IsNull(number_string))
    {
    goto end; //String
    }
    }

    // example_response->bool_string
    cJSON *bool_string = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "boolString");
    if (bool_string) { 
    if(!cJSON_IsString(bool_string) && !cJSON_IsNull(bool_string))
    {
    goto end; //String
    }
    }

    // example_response->null_string
    cJSON *null_string = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "nullString");
    if (null_string) { 
    if(!cJSON_IsString(null_string) && !cJSON_IsNull(null_string))
    {
    goto end; //String
    }
    }

    // example_response->a_bool
    cJSON *a_bool = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "aBool");
    if (a_bool) { 
    if(!cJSON_IsBool(a_bool))
    {
    goto end; //Bool
    }
    }

    // example_response->zero
    cJSON *zero = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "zero");
    if (zero) { 
    if(!cJSON_IsNumber(zero))
    {
    goto end; //Numeric
    }
    }


    example_response_local_var = example_response_create (
        empty_string && !cJSON_IsNull(empty_string) ? strdup(empty_string->valuestring) : NULL,
        number_string && !cJSON_IsNull(number_string) ? strdup(number_string->valuestring) : NULL,
        bool_string && !cJSON_IsNull(bool_string) ? strdup(bool_string->valuestring) : NULL,
        null_string && !cJSON_IsNull(null_string) ? strdup(null_string->valuestring) : NULL,
        a_bool ? a_bool->valueint : 0,
        zero ? zero->valuedouble : 0
        );

    return example_response_local_var;
end:
    return NULL;

}
