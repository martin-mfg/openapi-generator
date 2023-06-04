package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${default.name:default}", configuration = ClientConfiguration.class)
public interface DefaultApiClient extends DefaultApi {
}
