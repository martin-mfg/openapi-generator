import {
    Configuration,
    ConfigurationParameters,
} from "../index";

import {
    DefaultApi,
} from "./index";

export class Api {
    public static defaultApi: DefaultApi;

    public static init(apiBaseConfig: ConfigurationParameters) {
        Api.defaultApi = new DefaultApi(new Configuration(apiBaseConfig));
    }
}
