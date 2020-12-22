package org.sunmoon.smcard.cardrecord;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunmoon.smcard.auth.AuthInfoMapper;
import org.sunmoon.smcard.co.AuthInfo;
import org.sunmoon.smcard.co.CardRecord;
import org.sunmoon.smcard.co.Patient;
import org.sunmoon.smcard.co.Shop;
import org.sunmoon.smcard.shop.ShopMapper;

@Service
public class CardRecordServiceImpl implements CardRecordService {
	@Autowired
	private AuthInfoMapper authInfoMapper;

	@Autowired
	private ShopMapper shopMapper;

	@Autowired
	private CardRecordMapper cardRecordMapper;

	@Override
	public List<Shop> findCardRecord(Patient patient, AuthInfo authInfo) {
		List<Shop> shops = new ArrayList<Shop>();

		if (authInfoMapper.select(authInfo) != null) {
			List<CardRecord> cardRecords = this.cardRecordMapper.selectAll(patient);

			for (int i = 0; i < cardRecords.size(); i++) {
				Shop shop = new Shop();
				shop = this.shopMapper.select(cardRecords.get(i));

				shop.setVisitCount(this.cardRecordMapper.selectCount(shop, patient));
				shops.add(shop);
			}
		}

		return shops;
	}
}
