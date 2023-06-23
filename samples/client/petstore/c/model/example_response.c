#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "example_response.h"



example_response_t *example_response_create(
    other_object_t *my_only_property
    ) {
    example_response_t *example_response_local_var = malloc(sizeof(example_response_t));
    if (!example_response_local_var) {
        return NULL;
    }
    example_response_local_var->my_only_property = my_only_property;

    return example_response_local_var;
}


void example_response_free(example_response_t *example_response) {
    if(NULL == example_response){
        return ;
    }
    listEntry_t *listEntry;
    if (example_response->my_only_property) {
        other_object_free(example_response->my_only_property);
        example_response->my_only_property = NULL;
    }
    free(example_response);
}

cJSON *example_response_convertToJSON(example_response_t *example_response) {
    cJSON *item = cJSON_CreateObject();

    // example_response->my_only_property
    if(example_response->my_only_property) {
    cJSON *my_only_property_local_JSON = other_object_convertToJSON(example_response->my_only_property);
    if(my_only_property_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "myOnlyProperty", my_only_property_local_JSON);
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

example_response_t *example_response_parseFromJSON(cJSON *example_responseJSON){

    example_response_t *example_response_local_var = NULL;

    // define the local variable for example_response->my_only_property
    other_object_t *my_only_property_local_nonprim = NULL;

    // example_response->my_only_property
    cJSON *my_only_property = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "myOnlyProperty");
    if (my_only_property) { 
    my_only_property_local_nonprim = other_object_parseFromJSON(my_only_property); //nonprimitive
    }


    example_response_local_var = example_response_create (
        my_only_property ? my_only_property_local_nonprim : NULL
        );

    return example_response_local_var;
end:
    if (my_only_property_local_nonprim) {
        other_object_free(my_only_property_local_nonprim);
        my_only_property_local_nonprim = NULL;
    }
    return NULL;

}
