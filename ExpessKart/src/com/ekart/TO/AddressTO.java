package com.ekart.TO;

public class AddressTO {
	private int addressId;
	private int userDetailsId;
	private int userId;
	private String country;
	private String state;
	private String city;
	private String street1;
	private String street2;
	private int pincode;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getUserDetailsId() {
		return userDetailsId;
	}
	public void setUserDetailsId(int userDetailsId) {
		this.userDetailsId = userDetailsId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
