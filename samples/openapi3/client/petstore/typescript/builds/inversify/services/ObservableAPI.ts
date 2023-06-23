import type { HttpFile } from "../http/http";
import type { Observable } from "../rxjsStub";
import type { Configuration } from "../configuration";

import { Dummy200Response } from "../models/Dummy200Response";
import { Dummy200ResponseOuterProp } from "../models/Dummy200ResponseOuterProp";
import { Dummy200ResponseOuterPropInnerProp } from "../models/Dummy200ResponseOuterPropInnerProp";


export abstract class AbstractObservableDefaultApi {
    public abstract dummy(options?: Configuration): Observable<Dummy200Response>;

}
