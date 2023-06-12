import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ExampleResponse } from '../models/ExampleResponse';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

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
