import type { HttpFile } from '../http/http';
import type { Configuration } from '../configuration'
import type * as req from "../types/ObjectParamAPI";



export abstract class AbstractObjectDefaultApi {
    /**
     * get some object
     * @param param the request object
     */
    public abstract retrieveSomething(param: req.DefaultApiRetrieveSomethingRequest, options?: Configuration): Promise<number>;

}
