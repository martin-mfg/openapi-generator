/*
 * node.h
 *
 * dummy
 */

#ifndef _node_H_
#define _node_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct node_t node_t;




typedef struct node_t {
    struct node_t *left; //model
    struct node_t *right; //model

} node_t;

node_t *node_create(
    node_t *left,
    node_t *right
);

void node_free(node_t *node);

node_t *node_parseFromJSON(cJSON *nodeJSON);

cJSON *node_convertToJSON(node_t *node);

#endif /* _node_H_ */

