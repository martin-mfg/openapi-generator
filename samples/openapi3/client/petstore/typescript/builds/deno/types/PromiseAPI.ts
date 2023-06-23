import { ResponseContext, RequestContext, HttpFile } from '../http/http.ts';
import { Configuration} from '../configuration.ts'

import { Dummy200Response } from '../models/Dummy200Response.ts';
import { Dummy200ResponseOuterProp } from '../models/Dummy200ResponseOuterProp.ts';
import { Dummy200ResponseOuterPropInnerProp } from '../models/Dummy200ResponseOuterPropInnerProp.ts';
import { ExampleResponse } from '../models/ExampleResponse.ts';
import { Node } from '../models/Node.ts';
import { OtherObject } from '../models/OtherObject.ts';
import { ObservableDefaultApi } from './ObservableAPI.ts';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi.ts";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * dummy
     */
    public dummy(_options?: Configuration): Promise<ExampleResponse | Dummy200Response> {
        const result = this.api.dummy(_options);
        return result.toPromise();
    }


}



