import type { HttpFile } from "../http/http";
import type { Configuration } from "../configuration";

import { Dummy200Response } from "../models/Dummy200Response";
import { Dummy200ResponseOuterProp } from "../models/Dummy200ResponseOuterProp";
import { Dummy200ResponseOuterPropInnerProp } from "../models/Dummy200ResponseOuterPropInnerProp";
import { ExampleResponse } from "../models/ExampleResponse";
import { Node } from "../models/Node";
import { OtherObject } from "../models/OtherObject";


export abstract class AbstractPromiseDefaultApi {
    public abstract dummy(options?: Configuration): Promise<ExampleResponse | Dummy200Response>;

}
