import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { injectable, inject, optional } from "inversify";
import { AbstractConfiguration } from "../services/configuration";

import { ExampleResponse } from '../models/ExampleResponse';
import { OtherObject } from '../models/OtherObject';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
import { AbstractDefaultApiRequestFactory, AbstractDefaultApiResponseProcessor } from "../apis/DefaultApi.service";

@injectable()
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        @inject(AbstractConfiguration) configuration: Configuration,
        @inject(AbstractDefaultApiRequestFactory) @optional() requestFactory?: AbstractDefaultApiRequestFactory,
        @inject(AbstractDefaultApiResponseProcessor) @optional() responseProcessor?: AbstractDefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * dummy
     */
    public dummy(_options?: Configuration): Promise<ExampleResponse> {
        const result = this.api.dummy(_options);
        return result.toPromise();
    }


}



