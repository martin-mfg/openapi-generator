import { ResponseContext, RequestContext, HttpFile } from '../http/http.ts';
import { Configuration} from '../configuration.ts'

import { ExampleResponse } from '../models/ExampleResponse.ts';

import { ObservableDefaultApi } from "./ObservableAPI.ts";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi.ts";

export interface DefaultApiRetrieveSomethingRequest {
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * get some object
     * @param param the request object
     */
    public retrieveSomething(param: DefaultApiRetrieveSomethingRequest = {}, options?: Configuration): Promise<ExampleResponse> {
        return this.api.retrieveSomething( options).toPromise();
    }

}
