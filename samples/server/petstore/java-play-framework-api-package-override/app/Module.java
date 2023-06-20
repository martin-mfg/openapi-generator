import com.google.inject.AbstractModule;

import com.puppies.store.apis.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(DefaultApiControllerImpInterface.class).to(DefaultApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}