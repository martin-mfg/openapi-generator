import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ExampleResponse } from '../models/ExampleResponse';
import { Node } from '../models/Node';
import { OtherObject } from '../models/OtherObject';

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
    public dummy(param: DefaultApiDummyRequest = {}, options?: Configuration): Promise<ExampleResponse | Node> {
        return this.api.dummy( options).toPromise();
    }

}
