#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dummy_200_response_outer_prop_inner_prop.h"



dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop_create(
    int my_bool
    ) {
    dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop_local_var = malloc(sizeof(dummy_200_response_outer_prop_inner_prop_t));
    if (!dummy_200_response_outer_prop_inner_prop_local_var) {
        return NULL;
    }
    dummy_200_response_outer_prop_inner_prop_local_var->my_bool = my_bool;

    return dummy_200_response_outer_prop_inner_prop_local_var;
}


void dummy_200_response_outer_prop_inner_prop_free(dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop) {
    if(NULL == dummy_200_response_outer_prop_inner_prop){
        return ;
    }
    listEntry_t *listEntry;
    free(dummy_200_response_outer_prop_inner_prop);
}

cJSON *dummy_200_response_outer_prop_inner_prop_convertToJSON(dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop) {
    cJSON *item = cJSON_CreateObject();

    // dummy_200_response_outer_prop_inner_prop->my_bool
    if(dummy_200_response_outer_prop_inner_prop->my_bool) {
    if(cJSON_AddBoolToObject(item, "myBool", dummy_200_response_outer_prop_inner_prop->my_bool) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop_parseFromJSON(cJSON *dummy_200_response_outer_prop_inner_propJSON){

    dummy_200_response_outer_prop_inner_prop_t *dummy_200_response_outer_prop_inner_prop_local_var = NULL;

    // dummy_200_response_outer_prop_inner_prop->my_bool
    cJSON *my_bool = cJSON_GetObjectItemCaseSensitive(dummy_200_response_outer_prop_inner_propJSON, "myBool");
    if (my_bool) { 
    if(!cJSON_IsBool(my_bool))
    {
    goto end; //Bool
    }
    }


    dummy_200_response_outer_prop_inner_prop_local_var = dummy_200_response_outer_prop_inner_prop_create (
        my_bool ? my_bool->valueint : 0
        );

    return dummy_200_response_outer_prop_inner_prop_local_var;
end:
    return NULL;

}
