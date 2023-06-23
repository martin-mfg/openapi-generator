#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dummy_200_response_outer_prop.h"



dummy_200_response_outer_prop_t *dummy_200_response_outer_prop_create(
    dummy_200_response_outer_prop_inner_prop_t *inner_prop
    ) {
    dummy_200_response_outer_prop_t *dummy_200_response_outer_prop_local_var = malloc(sizeof(dummy_200_response_outer_prop_t));
    if (!dummy_200_response_outer_prop_local_var) {
        return NULL;
    }
    dummy_200_response_outer_prop_local_var->inner_prop = inner_prop;

    return dummy_200_response_outer_prop_local_var;
}


void dummy_200_response_outer_prop_free(dummy_200_response_outer_prop_t *dummy_200_response_outer_prop) {
    if(NULL == dummy_200_response_outer_prop){
        return ;
    }
    listEntry_t *listEntry;
    if (dummy_200_response_outer_prop->inner_prop) {
        dummy_200_response_outer_prop_inner_prop_free(dummy_200_response_outer_prop->inner_prop);
        dummy_200_response_outer_prop->inner_prop = NULL;
    }
    free(dummy_200_response_outer_prop);
}

cJSON *dummy_200_response_outer_prop_convertToJSON(dummy_200_response_outer_prop_t *dummy_200_response_outer_prop) {
    cJSON *item = cJSON_CreateObject();

    // dummy_200_response_outer_prop->inner_prop
    if(dummy_200_response_outer_prop->inner_prop) {
    cJSON *inner_prop_local_JSON = dummy_200_response_outer_prop_inner_prop_convertToJSON(dummy_200_response_outer_prop->inner_prop);
    if(inner_prop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "innerProp", inner_prop_local_JSON);
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

dummy_200_response_outer_prop_t *dummy_200_response_outer_prop_parseFromJSON(cJSON *dummy_200_response_outer_propJSON){

    dummy_200_response_outer_prop_t *dummy_200_response_outer_prop_local_var = NULL;

    // define the local variable for dummy_200_response_outer_prop->inner_prop
    dummy_200_response_outer_prop_inner_prop_t *inner_prop_local_nonprim = NULL;

    // dummy_200_response_outer_prop->inner_prop
    cJSON *inner_prop = cJSON_GetObjectItemCaseSensitive(dummy_200_response_outer_propJSON, "innerProp");
    if (inner_prop) { 
    inner_prop_local_nonprim = dummy_200_response_outer_prop_inner_prop_parseFromJSON(inner_prop); //nonprimitive
    }


    dummy_200_response_outer_prop_local_var = dummy_200_response_outer_prop_create (
        inner_prop ? inner_prop_local_nonprim : NULL
        );

    return dummy_200_response_outer_prop_local_var;
end:
    if (inner_prop_local_nonprim) {
        dummy_200_response_outer_prop_inner_prop_free(inner_prop_local_nonprim);
        inner_prop_local_nonprim = NULL;
    }
    return NULL;

}
