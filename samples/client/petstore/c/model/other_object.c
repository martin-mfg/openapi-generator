#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "other_object.h"



other_object_t *other_object_create(
    example_response_t *my_only_property2
    ) {
    other_object_t *other_object_local_var = malloc(sizeof(other_object_t));
    if (!other_object_local_var) {
        return NULL;
    }
    other_object_local_var->my_only_property2 = my_only_property2;

    return other_object_local_var;
}


void other_object_free(other_object_t *other_object) {
    if(NULL == other_object){
        return ;
    }
    listEntry_t *listEntry;
    if (other_object->my_only_property2) {
        example_response_free(other_object->my_only_property2);
        other_object->my_only_property2 = NULL;
    }
    free(other_object);
}

cJSON *other_object_convertToJSON(other_object_t *other_object) {
    cJSON *item = cJSON_CreateObject();

    // other_object->my_only_property2
    if(other_object->my_only_property2) {
    cJSON *my_only_property2_local_JSON = example_response_convertToJSON(other_object->my_only_property2);
    if(my_only_property2_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "myOnlyProperty2", my_only_property2_local_JSON);
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

other_object_t *other_object_parseFromJSON(cJSON *other_objectJSON){

    other_object_t *other_object_local_var = NULL;

    // define the local variable for other_object->my_only_property2
    example_response_t *my_only_property2_local_nonprim = NULL;

    // other_object->my_only_property2
    cJSON *my_only_property2 = cJSON_GetObjectItemCaseSensitive(other_objectJSON, "myOnlyProperty2");
    if (my_only_property2) { 
    my_only_property2_local_nonprim = example_response_parseFromJSON(my_only_property2); //nonprimitive
    }


    other_object_local_var = other_object_create (
        my_only_property2 ? my_only_property2_local_nonprim : NULL
        );

    return other_object_local_var;
end:
    if (my_only_property2_local_nonprim) {
        example_response_free(my_only_property2_local_nonprim);
        my_only_property2_local_nonprim = NULL;
    }
    return NULL;

}
