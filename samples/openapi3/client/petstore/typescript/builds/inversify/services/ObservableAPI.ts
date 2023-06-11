import type { HttpFile } from "../http/http";
import type { Observable } from "../rxjsStub";
import type { Configuration } from "../configuration";

import { ExampleResponse } from "../models/ExampleResponse";


export abstract class AbstractObservableDefaultApi {
    public abstract retrieveSomething(options?: Configuration): Observable<ExampleResponse>;

}
