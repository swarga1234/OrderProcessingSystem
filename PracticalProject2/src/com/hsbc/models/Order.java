package com.hsbc.models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Deepanshu: Model Class for Order
 */
public class Order {

	int orderID;
	LocalDate date;
	private int customerID;
	private String customerShippingAddress;
	ArrayList productIDList;
	int totalOrderValue;
	int shippingCost;
	String agency;
	String status;

	public Order(int orderID, LocalDate date, int customerID, String customerShippingAddress, ArrayList productIDList,
			int totalOrderValue, int shippingCost, String agency, String status) {
		super();
		this.orderID = orderID;
		this.date = date;
		this.customerID = customerID;
		this.customerShippingAddress = customerShippingAddress;
		this.productIDList = productIDList;
		this.totalOrderValue = totalOrderValue;
		this.shippingCost = shippingCost;
		this.agency = agency;
		this.status = status;
	}

	public Order() {
		super();
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerShippingAddress() {
		return customerShippingAddress;
	}

	public void setCustomerShippingAddress(String customerShippingAddress) {
		this.customerShippingAddress = customerShippingAddress;
	}

	public ArrayList getProductIDList() {
		return productIDList;
	}

	public void setProductIDList(ArrayList productIDList) {
		this.productIDList = productIDList;
	}

	public int getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(int totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	public int getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(int shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", date=" + date + ", customerID=" + customerID
				+ ", customerShippingAddress=" + customerShippingAddress + ", productIDList=" + productIDList
				+ ", totalOrderValue=" + totalOrderValue + ", shippingCost=" + shippingCost + ", agency=" + agency
				+ ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agency == null) ? 0 : agency.hashCode());
		result = prime * result + customerID;
		result = prime * result + ((customerShippingAddress == null) ? 0 : customerShippingAddress.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + orderID;
		result = prime * result + ((productIDList == null) ? 0 : productIDList.hashCode());
		result = prime * result + shippingCost;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + totalOrderValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (agency == null) {
			if (other.agency != null)
				return false;
		} else if (!agency.equals(other.agency))
			return false;
		if (customerID != other.customerID)
			return false;
		if (customerShippingAddress == null) {
			if (other.customerShippingAddress != null)
				return false;
		} else if (!customerShippingAddress.equals(other.customerShippingAddress))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (orderID != other.orderID)
			return false;
		if (productIDList == null) {
			if (other.productIDList != null)
				return false;
		} else if (!productIDList.equals(other.productIDList))
			return false;
		if (shippingCost != other.shippingCost)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalOrderValue != other.totalOrderValue)
			return false;
		return true;
	}

}