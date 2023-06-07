import {
    Configuration,
    ConfigurationParameters,
} from "../";

import {
    DefaultApi,
} from "./";

export class Api {
    public static defaultApi: DefaultApi;

    public static init(apiBaseConfig: ConfigurationParameters) {
        Api.defaultApi = new DefaultApi(new Configuration(apiBaseConfig));
    }
}