import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { Dummy200Response } from '../models/Dummy200Response';
import { Dummy200ResponseOuterProp } from '../models/Dummy200ResponseOuterProp';
import { Dummy200ResponseOuterPropInnerProp } from '../models/Dummy200ResponseOuterPropInnerProp';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

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
