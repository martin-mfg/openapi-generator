import type { HttpFile } from '../http/http';
import type { Configuration } from '../configuration'
import type * as req from "../types/ObjectParamAPI";

import type { ExampleResponse } from '../models/ExampleResponse';
import type { OtherObject } from '../models/OtherObject';


export abstract class AbstractObjectDefaultApi {
    /**
     * dummy
     * @param param the request object
     */
    public abstract dummy(param: req.DefaultApiDummyRequest, options?: Configuration): Promise<ExampleResponse>;

}
