package org.sunmoon.smcard.shop;

import org.sunmoon.smcard.co.CardRecord;
import org.sunmoon.smcard.co.Shop;

public interface ShopMapper {
	public Shop select(CardRecord cardRecord);

}
