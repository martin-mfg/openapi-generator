import type { HttpFile } from '../http/http';
import type { Configuration } from '../configuration'
import type * as req from "../types/ObjectParamAPI";

import type { ExampleResponse } from '../models/ExampleResponse';


export abstract class AbstractObjectDefaultApi {
    /**
     * 
     * @param param the request object
     */
    public abstract exampleSomeMethodGet(param: req.DefaultApiExampleSomeMethodGetRequest, options?: Configuration): Promise<ExampleResponse>;

}
