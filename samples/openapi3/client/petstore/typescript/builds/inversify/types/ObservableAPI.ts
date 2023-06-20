import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { injectable, inject, optional } from "inversify";
import { AbstractConfiguration } from "../services/configuration";
import { ExampleResponse } from '../models/ExampleResponse';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
import { AbstractDefaultApiRequestFactory, AbstractDefaultApiResponseProcessor } from "../apis/DefaultApi.service";

@injectable()
export class ObservableDefaultApi {
    private requestFactory: AbstractDefaultApiRequestFactory;
    private responseProcessor: AbstractDefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        @inject(AbstractConfiguration) configuration: Configuration,
        @inject(AbstractDefaultApiRequestFactory) @optional() requestFactory?: AbstractDefaultApiRequestFactory,
        @inject(AbstractDefaultApiResponseProcessor) @optional() responseProcessor?: AbstractDefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * dummy
     */
    public dummy(_options?: Configuration): Observable<ExampleResponse> {
        const requestContextPromise = this.requestFactory.dummy(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.dummy(rsp)));
            }));
    }

}
