/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { OuterEnum } from '../models/OuterEnum';
import { OuterEnumDefaultValue } from '../models/OuterEnumDefaultValue';
import { OuterEnumInteger } from '../models/OuterEnumInteger';
import { OuterEnumIntegerDefaultValue } from '../models/OuterEnumIntegerDefaultValue';
import { HttpFile } from '../http/http';

export class EnumTest {
    'enumString'?: EnumTestEnumStringEnum;
    'enumStringRequired': EnumTestEnumStringRequiredEnum;
    'enumInteger'?: EnumTestEnumIntegerEnum;
    'enumNumber'?: EnumTestEnumNumberEnum;
    'outerEnum'?: OuterEnum | null;
    'outerEnumInteger'?: OuterEnumInteger;
    'outerEnumDefaultValue'?: OuterEnumDefaultValue;
    'outerEnumIntegerDefaultValue'?: OuterEnumIntegerDefaultValue;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "enumString",
            "baseName": "enum_string",
            "type": "EnumTestEnumStringEnum",
            "format": ""
        },
        {
            "name": "enumStringRequired",
            "baseName": "enum_string_required",
            "type": "EnumTestEnumStringRequiredEnum",
            "format": ""
        },
        {
            "name": "enumInteger",
            "baseName": "enum_integer",
            "type": "EnumTestEnumIntegerEnum",
            "format": "int32"
        },
        {
            "name": "enumNumber",
            "baseName": "enum_number",
            "type": "EnumTestEnumNumberEnum",
            "format": "double"
        },
        {
            "name": "outerEnum",
            "baseName": "outerEnum",
            "type": "OuterEnum",
            "format": ""
        },
        {
            "name": "outerEnumInteger",
            "baseName": "outerEnumInteger",
            "type": "OuterEnumInteger",
            "format": ""
        },
        {
            "name": "outerEnumDefaultValue",
            "baseName": "outerEnumDefaultValue",
            "type": "OuterEnumDefaultValue",
            "format": ""
        },
        {
            "name": "outerEnumIntegerDefaultValue",
            "baseName": "outerEnumIntegerDefaultValue",
            "type": "OuterEnumIntegerDefaultValue",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return EnumTest.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum EnumTestEnumStringEnum {
    Upper = 'UPPER',
    Lower = 'lower',
    Empty = ''
}
export enum EnumTestEnumStringRequiredEnum {
    Upper = 'UPPER',
    Lower = 'lower',
    Empty = ''
}
export enum EnumTestEnumIntegerEnum {
    NUMBER_1 = 1,
    NUMBER_MINUS_1 = -1
}
export enum EnumTestEnumNumberEnum {
    NUMBER_1_DOT_1 = 1.1,
    NUMBER_MINUS_1_DOT_2 = -1.2
}

