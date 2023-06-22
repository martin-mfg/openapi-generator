/* tslint:disable */
/* eslint-disable */
/**
 * dummy
 * @export
 * @interface ExampleResponse
 */
export interface ExampleResponse {
    /**
     * 
     * @type {OtherObject}
     * @memberof ExampleResponse
     */
    myOnlyProperty?: OtherObject;
}
/**
 * dummy
 * @export
 * @interface Node
 */
export interface Node {
    /**
     * 
     * @type {Node}
     * @memberof Node
     */
    left?: Node;
    /**
     * 
     * @type {Node}
     * @memberof Node
     */
    right?: Node;
}
/**
 * dummy
 * @export
 * @interface OtherObject
 */
export interface OtherObject {
    /**
     * 
     * @type {ExampleResponse}
     * @memberof OtherObject
     */
    myOnlyProperty2?: ExampleResponse;
}
