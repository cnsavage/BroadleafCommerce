/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.offer.domain;

import org.broadleafcommerce.common.money.Money;
import org.broadleafcommerce.core.order.domain.OrderItemPriceDetail;

/**
 * Records the actual adjustments that were made to an OrderItemPriceDetail.
 * 
 * @author bpolster
 *
 */
public interface OrderItemPriceDetailAdjustment extends Adjustment {

    /**
     * Stores the offer name at the time the adjustment was made.   Primarily to simplify display 
     * within the admin.
     * 
     * @return
     */
    public String getOfferName();

    /**
     * Returns the name of the offer at the time the adjustment was made.
     * @param offerName
     */
    public void setOfferName(String offerName);

    public OrderItemPriceDetail getOrderItemPriceDetail();

    public void init(OrderItemPriceDetail orderItemPriceDetail, Offer offer, String reason);

    public void setOrderItemPriceDetail(OrderItemPriceDetail orderItemPriceDetail);

    /**
     * Even for items that are on sale, it is possible that an adjustment was made
     * to the retail price that gave the customer a better offer.
     *
     * Since some offers can be applied to the sale price and some only to the
     * retail price, this setting provides the required value.
     *
     * @return true if this adjustment was applied to the sale price
     */
    public boolean isAppliedToSalePrice();

    public void setAppliedToSalePrice(boolean appliedToSalePrice);

    /**
     * Value of this adjustment relative to the retail price.
     * @return
     */
    public Money getRetailPriceValue();

    public void setRetailPriceValue(Money retailPriceValue);

    /**
     * Value of this adjustment relative to the sale price.
     *
     * @return
     */
    public Money getSalesPriceValue();

    public void setSalesPriceValue(Money salesPriceValue);
}
