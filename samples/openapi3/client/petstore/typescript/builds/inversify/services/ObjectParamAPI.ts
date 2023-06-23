import type { HttpFile } from '../http/http';
import type { Configuration } from '../configuration'
import type * as req from "../types/ObjectParamAPI";

import type { Dummy200Response } from '../models/Dummy200Response';
import type { Dummy200ResponseOuterProp } from '../models/Dummy200ResponseOuterProp';
import type { Dummy200ResponseOuterPropInnerProp } from '../models/Dummy200ResponseOuterPropInnerProp';
import type { ExampleResponse } from '../models/ExampleResponse';
import type { Node } from '../models/Node';
import type { OtherObject } from '../models/OtherObject';


export abstract class AbstractObjectDefaultApi {
    /**
     * dummy
     * @param param the request object
     */
    public abstract dummy(param: req.DefaultApiDummyRequest, options?: Configuration): Promise<ExampleResponse | Dummy200Response>;

}
