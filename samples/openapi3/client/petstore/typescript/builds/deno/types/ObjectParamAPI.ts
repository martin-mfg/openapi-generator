import { ResponseContext, RequestContext, HttpFile } from '../http/http.ts';
import { Configuration} from '../configuration.ts'

import { Dummy200Response } from '../models/Dummy200Response.ts';
import { Dummy200ResponseOuterProp } from '../models/Dummy200ResponseOuterProp.ts';
import { Dummy200ResponseOuterPropInnerProp } from '../models/Dummy200ResponseOuterPropInnerProp.ts';

import { ObservableDefaultApi } from "./ObservableAPI.ts";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi.ts";

export interface DefaultApiDummyRequest {
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * dummy
     * @param param the request object
     */
    public dummy(param: DefaultApiDummyRequest = {}, options?: Configuration): Promise<Dummy200Response> {
        return this.api.dummy( options).toPromise();
    }

}
