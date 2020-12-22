package org.sunmoon.smcard.cardrecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sunmoon.smcard.co.AuthInfo;
import org.sunmoon.smcard.co.Patient;
import org.sunmoon.smcard.co.RequestVO;

@RestController
@RequestMapping("/smcard/cardrecord")
public class CardRecordController {
	@Autowired
	private CardRecordServiceImpl cardRecordServiceImpl;

	@PostMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> search(@RequestBody RequestVO requestVO) {
		Patient patient = requestVO.getPatient();
		AuthInfo authInfo = requestVO.getAuthInfo();

		return ResponseEntity.status(HttpStatus.OK).body(cardRecordServiceImpl.findCardRecord(patient, authInfo));
	}

}
