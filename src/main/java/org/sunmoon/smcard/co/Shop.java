package org.sunmoon.smcard.co;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String businessRegistNo;
    private String shopName;
    private String address;
    private String detailAddress;
    private String zipCode;
    
    private List<Count> visitCount;

    public Shop() {
    }

	public Shop(String businessRegistNo, String shopName, String address, 
			String detailAddress, String zipCode, List<Count> visitCount) {
		super();
		this.businessRegistNo = businessRegistNo;
		this.shopName = shopName;
		this.address = address;
		this.detailAddress = detailAddress;
		this.zipCode = zipCode;
		this.visitCount = visitCount;
	}

	public String getBusinessRegistNo() {
		return businessRegistNo;
	}

	public void setBusinessRegistNo(String businessRegistNo) {
		this.businessRegistNo = businessRegistNo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<Count> getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(List<Count> visitCount) {
		this.visitCount = visitCount;
	}
}
