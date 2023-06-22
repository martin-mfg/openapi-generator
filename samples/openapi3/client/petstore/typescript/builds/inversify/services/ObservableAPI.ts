import type { HttpFile } from "../http/http";
import type { Observable } from "../rxjsStub";
import type { Configuration } from "../configuration";

import { ExampleResponse } from "../models/ExampleResponse";
import { OtherObject } from "../models/OtherObject";


export abstract class AbstractObservableDefaultApi {
    public abstract dummy(options?: Configuration): Observable<ExampleResponse>;

}
