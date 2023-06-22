import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ExampleResponse } from '../models/ExampleResponse';
import { Node } from '../models/Node';
import { OtherObject } from '../models/OtherObject';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
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
    public dummy(_options?: Configuration): Promise<ExampleResponse | Node> {
        const result = this.api.dummy(_options);
        return result.toPromise();
    }


}



