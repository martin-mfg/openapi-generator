import type { Configuration } from "../configuration";
import type { HttpFile, RequestContext, ResponseContext } from "../http/http";

import { ExampleResponse } from "../models/ExampleResponse";

export abstract class AbstractDefaultApiRequestFactory {
    public abstract retrieveSomething(options?: Configuration): Promise<RequestContext>;

}


export abstract class AbstractDefaultApiResponseProcessor {
     public abstract retrieveSomething(response: ResponseContext): Promise<ExampleResponse >;

}
