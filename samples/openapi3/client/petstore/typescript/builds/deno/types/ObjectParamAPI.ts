import { ResponseContext, RequestContext, HttpFile } from '../http/http.ts';
import { Configuration} from '../configuration.ts'

import { ExampleResponse } from '../models/ExampleResponse.ts';

import { ObservableDefaultApi } from "./ObservableAPI.ts";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi.ts";

export interface DefaultApiExampleSomeMethodGetRequest {
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * 
     * @param param the request object
     */
    public exampleSomeMethodGet(param: DefaultApiExampleSomeMethodGetRequest = {}, options?: Configuration): Promise<ExampleResponse> {
        return this.api.exampleSomeMethodGet( options).toPromise();
    }

}
