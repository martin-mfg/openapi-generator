import type { Configuration } from "../configuration";
import type { HttpFile, RequestContext, ResponseContext } from "../http/http";

import { ExampleResponse } from "../models/ExampleResponse";

export abstract class AbstractDefaultApiRequestFactory {
    public abstract exampleSomeMethodGet(options?: Configuration): Promise<RequestContext>;

}


export abstract class AbstractDefaultApiResponseProcessor {
     public abstract exampleSomeMethodGet(response: ResponseContext): Promise<ExampleResponse >;

}
