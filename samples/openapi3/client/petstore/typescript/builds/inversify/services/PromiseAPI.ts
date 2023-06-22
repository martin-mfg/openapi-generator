import type { HttpFile } from "../http/http";
import type { Configuration } from "../configuration";

import { ExampleResponse } from "../models/ExampleResponse";
import { OtherObject } from "../models/OtherObject";


export abstract class AbstractPromiseDefaultApi {
    public abstract dummy(options?: Configuration): Promise<ExampleResponse>;

}
