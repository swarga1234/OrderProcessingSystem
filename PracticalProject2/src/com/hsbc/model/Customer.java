package com.hsbc.model;
/*
 * @author shubham kumar
 */

import java.util.Objects;

public final class Customer {
	private final int customerId;
	private String customerName;
	private final long gstNumber;
	private String customerAddress;
	private String city;
	private String email;
	private long phoneNumber;
	private int pinCode;

	public Customer(int customerId, String customerName, long gstNumber, String customerAddress, String city,
			String email, long phoneNumber, int pinCode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gstNumber = gstNumber;
		this.customerAddress = customerAddress;
		this.city = city;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.pinCode = pinCode;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName to set the customerName 
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress to set the customerAddress 
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city to set the city 
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email to set the email 
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber to set the phoneNumber
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode to set the pinCode
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @return the gstNumber
	 */
	public long getGstNumber() {
		return gstNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gstNumber=" + gstNumber
				+ ", customerAddress=" + customerAddress + ", city=" + city + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", pinCode=" + pinCode + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, gstNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId && gstNumber == other.gstNumber;
	}

}
