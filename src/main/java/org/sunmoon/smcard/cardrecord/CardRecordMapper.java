package org.sunmoon.smcard.cardrecord;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.sunmoon.smcard.co.CardRecord;
import org.sunmoon.smcard.co.Count;
import org.sunmoon.smcard.co.Patient;
import org.sunmoon.smcard.co.Shop;

public interface CardRecordMapper {
	public List<CardRecord> selectAll(Patient patient);
	public List<Count> selectCount(@Param("Shop")Shop shop, @Param("Patient")Patient patient);
}
