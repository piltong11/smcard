package org.sunmoon.smcard.co;

import java.io.Serializable;

public class Count implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String paymentDate;
	private int count;
	
	public Count(String paymentDate, int count) {
		super();
		this.paymentDate = paymentDate;
		this.count = count;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
