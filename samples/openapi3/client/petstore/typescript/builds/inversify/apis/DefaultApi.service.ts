import type { Configuration } from "../configuration";
import type { HttpFile, RequestContext, ResponseContext } from "../http/http";

import { Dummy200Response } from "../models/Dummy200Response";

export abstract class AbstractDefaultApiRequestFactory {
    public abstract dummy(options?: Configuration): Promise<RequestContext>;

}


export abstract class AbstractDefaultApiResponseProcessor {
     public abstract dummy(response: ResponseContext): Promise<Dummy200Response >;

}
