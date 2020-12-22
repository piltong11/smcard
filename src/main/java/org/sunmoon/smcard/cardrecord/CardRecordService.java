package org.sunmoon.smcard.cardrecord;

import java.util.List;

import org.sunmoon.smcard.co.AuthInfo;
import org.sunmoon.smcard.co.Patient;
import org.sunmoon.smcard.co.Shop;

public interface CardRecordService {
	public List<Shop> findCardRecord(Patient patient, AuthInfo authInfo);
}
