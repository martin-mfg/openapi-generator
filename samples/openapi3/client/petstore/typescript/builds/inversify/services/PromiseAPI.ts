import type { HttpFile } from "../http/http";
import type { Configuration } from "../configuration";

import { ExampleResponse } from "../models/ExampleResponse";


export abstract class AbstractPromiseDefaultApi {
    public abstract exampleSomeMethodGet(options?: Configuration): Promise<ExampleResponse>;

}
