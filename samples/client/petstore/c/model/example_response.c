#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "example_response.h"



example_response_t *example_response_create(
    list_t *my_only_property
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
        list_ForEach(listEntry, example_response->my_only_property) {
            free(listEntry->data);
        }
        list_freeList(example_response->my_only_property);
        example_response->my_only_property = NULL;
    }
    free(example_response);
}

cJSON *example_response_convertToJSON(example_response_t *example_response) {
    cJSON *item = cJSON_CreateObject();

    // example_response->my_only_property
    if(example_response->my_only_property) {
    cJSON *my_only_property = cJSON_AddArrayToObject(item, "myOnlyProperty");
    if(my_only_property == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *my_only_propertyListEntry;
    list_ForEach(my_only_propertyListEntry, example_response->my_only_property) {
    if(cJSON_AddBoolToObject(my_only_property, "", *(cJSON_bool *)my_only_propertyListEntry->data) == NULL)
    {
        goto fail;
    }
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

    // define the local list for example_response->my_only_property
    list_t *my_only_propertyList = NULL;

    // example_response->my_only_property
    cJSON *my_only_property = cJSON_GetObjectItemCaseSensitive(example_responseJSON, "myOnlyProperty");
    if (my_only_property) { 
    cJSON *my_only_property_local = NULL;
    if(!cJSON_IsArray(my_only_property)) {
        goto end;//primitive container
    }
    my_only_propertyList = list_createList();

    cJSON_ArrayForEach(my_only_property_local, my_only_property)
    {
        if(!cJSON_IsBool(my_only_property_local))
        {
            goto end;
        }
        list_addElement(my_only_propertyList , my_only_property_local->valueint);
    }
    }


    example_response_local_var = example_response_create (
        my_only_property ? my_only_propertyList : NULL
        );

    return example_response_local_var;
end:
    if (my_only_propertyList) {
        list_freeList(my_only_propertyList);
        my_only_propertyList = NULL;
    }
    return NULL;

}
