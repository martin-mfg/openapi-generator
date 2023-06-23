#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dummy_200_response.h"



dummy_200_response_t *dummy_200_response_create(
    dummy_200_response_outer_prop_t *outer_prop
    ) {
    dummy_200_response_t *dummy_200_response_local_var = malloc(sizeof(dummy_200_response_t));
    if (!dummy_200_response_local_var) {
        return NULL;
    }
    dummy_200_response_local_var->outer_prop = outer_prop;

    return dummy_200_response_local_var;
}


void dummy_200_response_free(dummy_200_response_t *dummy_200_response) {
    if(NULL == dummy_200_response){
        return ;
    }
    listEntry_t *listEntry;
    if (dummy_200_response->outer_prop) {
        dummy_200_response_outer_prop_free(dummy_200_response->outer_prop);
        dummy_200_response->outer_prop = NULL;
    }
    free(dummy_200_response);
}

cJSON *dummy_200_response_convertToJSON(dummy_200_response_t *dummy_200_response) {
    cJSON *item = cJSON_CreateObject();

    // dummy_200_response->outer_prop
    if(dummy_200_response->outer_prop) {
    cJSON *outer_prop_local_JSON = dummy_200_response_outer_prop_convertToJSON(dummy_200_response->outer_prop);
    if(outer_prop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "outerProp", outer_prop_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dummy_200_response_t *dummy_200_response_parseFromJSON(cJSON *dummy_200_responseJSON){

    dummy_200_response_t *dummy_200_response_local_var = NULL;

    // define the local variable for dummy_200_response->outer_prop
    dummy_200_response_outer_prop_t *outer_prop_local_nonprim = NULL;

    // dummy_200_response->outer_prop
    cJSON *outer_prop = cJSON_GetObjectItemCaseSensitive(dummy_200_responseJSON, "outerProp");
    if (outer_prop) { 
    outer_prop_local_nonprim = dummy_200_response_outer_prop_parseFromJSON(outer_prop); //nonprimitive
    }


    dummy_200_response_local_var = dummy_200_response_create (
        outer_prop ? outer_prop_local_nonprim : NULL
        );

    return dummy_200_response_local_var;
end:
    if (outer_prop_local_nonprim) {
        dummy_200_response_outer_prop_free(outer_prop_local_nonprim);
        outer_prop_local_nonprim = NULL;
    }
    return NULL;

}
