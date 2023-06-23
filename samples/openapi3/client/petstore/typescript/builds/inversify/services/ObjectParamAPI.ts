import type { HttpFile } from '../http/http';
import type { Configuration } from '../configuration'
import type * as req from "../types/ObjectParamAPI";

import type { Dummy200Response } from '../models/Dummy200Response';
import type { Dummy200ResponseOuterProp } from '../models/Dummy200ResponseOuterProp';
import type { Dummy200ResponseOuterPropInnerProp } from '../models/Dummy200ResponseOuterPropInnerProp';


export abstract class AbstractObjectDefaultApi {
    /**
     * dummy
     * @param param the request object
     */
    public abstract dummy(param: req.DefaultApiDummyRequest, options?: Configuration): Promise<Dummy200Response>;

}
