/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.pricing.service.module;

import org.broadleafcommerce.common.vendor.service.exception.FulfillmentPriceException;
import org.broadleafcommerce.core.order.domain.FulfillmentGroup;
import org.broadleafcommerce.core.order.domain.FulfillmentOption;
import org.broadleafcommerce.core.pricing.service.fulfillment.provider.FulfillmentPricingProvider;

/**
 * @deprecated Superceded by functionality given by {@link FulfillmentOption} and {@link FulfillmentPricingProvider}
 * @see {@link FulfillmentPricingProvider}, {@link FulfillmentOption}
 */
@Deprecated
public interface ShippingModule {

    public String getName();

    public void setName(String name);

    public FulfillmentGroup calculateShippingForFulfillmentGroup(FulfillmentGroup fulfillmentGroup) throws FulfillmentPriceException;
    
    public String getServiceName();
    
    public Boolean isValidModuleForService(String serviceName);
    
    public void setDefaultModule(Boolean isDefaultModule);
    
    public Boolean isDefaultModule();

}
