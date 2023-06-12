import { ResponseContext, RequestContext, HttpFile } from '../http/http.ts';
import { Configuration} from '../configuration.ts'

import { ExampleResponse } from '../models/ExampleResponse.ts';
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
     * get some object
     */
    public retrieveSomething(_options?: Configuration): Promise<ExampleResponse> {
        const result = this.api.retrieveSomething(_options);
        return result.toPromise();
    }


}



