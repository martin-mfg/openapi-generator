#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "node.h"



node_t *node_create(
    node_t *left,
    node_t *right
    ) {
    node_t *node_local_var = malloc(sizeof(node_t));
    if (!node_local_var) {
        return NULL;
    }
    node_local_var->left = left;
    node_local_var->right = right;

    return node_local_var;
}


void node_free(node_t *node) {
    if(NULL == node){
        return ;
    }
    listEntry_t *listEntry;
    if (node->left) {
        node_free(node->left);
        node->left = NULL;
    }
    if (node->right) {
        node_free(node->right);
        node->right = NULL;
    }
    free(node);
}

cJSON *node_convertToJSON(node_t *node) {
    cJSON *item = cJSON_CreateObject();

    // node->left
    if(node->left) {
    cJSON *left_local_JSON = node_convertToJSON(node->left);
    if(left_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "left", left_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // node->right
    if(node->right) {
    cJSON *right_local_JSON = node_convertToJSON(node->right);
    if(right_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "right", right_local_JSON);
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

node_t *node_parseFromJSON(cJSON *nodeJSON){

    node_t *node_local_var = NULL;

    // define the local variable for node->left
    node_t *left_local_nonprim = NULL;

    // define the local variable for node->right
    node_t *right_local_nonprim = NULL;

    // node->left
    cJSON *left = cJSON_GetObjectItemCaseSensitive(nodeJSON, "left");
    if (left) { 
    left_local_nonprim = node_parseFromJSON(left); //nonprimitive
    }

    // node->right
    cJSON *right = cJSON_GetObjectItemCaseSensitive(nodeJSON, "right");
    if (right) { 
    right_local_nonprim = node_parseFromJSON(right); //nonprimitive
    }


    node_local_var = node_create (
        left ? left_local_nonprim : NULL,
        right ? right_local_nonprim : NULL
        );

    return node_local_var;
end:
    if (left_local_nonprim) {
        node_free(left_local_nonprim);
        left_local_nonprim = NULL;
    }
    if (right_local_nonprim) {
        node_free(right_local_nonprim);
        right_local_nonprim = NULL;
    }
    return NULL;

}
