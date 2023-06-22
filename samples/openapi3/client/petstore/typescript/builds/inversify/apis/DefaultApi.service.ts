import type { Configuration } from "../configuration";
import type { HttpFile, RequestContext, ResponseContext } from "../http/http";

import { ExampleResponse } from "../models/ExampleResponse";
import { Node } from "../models/Node";

export abstract class AbstractDefaultApiRequestFactory {
    public abstract dummy(options?: Configuration): Promise<RequestContext>;

}


export abstract class AbstractDefaultApiResponseProcessor {
     public abstract dummy(response: ResponseContext): Promise<ExampleResponse | Node >;

}
