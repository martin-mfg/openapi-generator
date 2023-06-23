/* tslint:disable */
/* eslint-disable */
/**
 * 
 * @export
 * @interface Dummy200Response
 */
export interface Dummy200Response {
    /**
     * 
     * @type {Dummy200ResponseOuterProp}
     * @memberof Dummy200Response
     */
    outerProp?: Dummy200ResponseOuterProp;
}
/**
 * 
 * @export
 * @interface Dummy200ResponseOuterProp
 */
export interface Dummy200ResponseOuterProp {
    /**
     * 
     * @type {Dummy200ResponseOuterPropInnerProp}
     * @memberof Dummy200ResponseOuterProp
     */
    innerProp?: Dummy200ResponseOuterPropInnerProp;
}
/**
 * 
 * @export
 * @interface Dummy200ResponseOuterPropInnerProp
 */
export interface Dummy200ResponseOuterPropInnerProp {
    /**
     * 
     * @type {boolean}
     * @memberof Dummy200ResponseOuterPropInnerProp
     */
    myBool?: boolean;
}
/**
 * dummy
 * @export
 * @interface ExampleResponse
 */
export interface ExampleResponse {
    /**
     * 
     * @type {string}
     * @memberof ExampleResponse
     */
    emptyString?: string;
    /**
     * 
     * @type {string}
     * @memberof ExampleResponse
     */
    numberString?: string;
    /**
     * 
     * @type {string}
     * @memberof ExampleResponse
     */
    boolString?: string;
    /**
     * 
     * @type {string}
     * @memberof ExampleResponse
     */
    nullString?: string;
    /**
     * 
     * @type {boolean}
     * @memberof ExampleResponse
     */
    aBool?: boolean;
    /**
     * 
     * @type {number}
     * @memberof ExampleResponse
     */
    zero?: number;
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
