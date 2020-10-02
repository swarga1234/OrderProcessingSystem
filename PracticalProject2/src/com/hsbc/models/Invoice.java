package com.hsbc.models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Deepanshu: Model class for Invoice
 *
 */
public class Invoice {

	int invoiceID;
	LocalDate invoiceDate;
	int orderID;
	private int customerID;
	ArrayList productsWithGST;
	String gSTtype;
	int gSTamount;
	int totalValue;
	String status;

	public Invoice(int invoiceID, LocalDate invoiceDate, int orderID, int customerID, ArrayList productsWithGST,
			String gSTtype, int gSTamount, int totalValue, String status) {
		super();
		this.invoiceID = invoiceID;
		this.invoiceDate = invoiceDate;
		this.orderID = orderID;
		this.customerID = customerID;
		this.productsWithGST = productsWithGST;
		this.gSTtype = gSTtype;
		this.gSTamount = gSTamount;
		this.totalValue = totalValue;
		this.status = status;
	}

	public Invoice() {
		super();
	}

	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public ArrayList getProductsWithGST() {
		return productsWithGST;
	}

	public void setProductsWithGST(ArrayList productsWithGST) {
		this.productsWithGST = productsWithGST;
	}

	public String getgSTtype() {
		return gSTtype;
	}

	public void setgSTtype(String gSTtype) {
		this.gSTtype = gSTtype;
	}

	public int getgSTamount() {
		return gSTamount;
	}

	public void setgSTamount(int gSTamount) {
		this.gSTamount = gSTamount;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceID=" + invoiceID + ", invoiceDate=" + invoiceDate + ", orderID=" + orderID
				+ ", customerID=" + customerID + ", productsWithGST=" + productsWithGST + ", gSTtype=" + gSTtype
				+ ", gSTamount=" + gSTamount + ", totalValue=" + totalValue + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerID;
		result = prime * result + gSTamount;
		result = prime * result + ((gSTtype == null) ? 0 : gSTtype.hashCode());
		result = prime * result + ((invoiceDate == null) ? 0 : invoiceDate.hashCode());
		result = prime * result + invoiceID;
		result = prime * result + orderID;
		result = prime * result + ((productsWithGST == null) ? 0 : productsWithGST.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + totalValue;
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
		Invoice other = (Invoice) obj;
		if (customerID != other.customerID)
			return false;
		if (gSTamount != other.gSTamount)
			return false;
		if (gSTtype == null) {
			if (other.gSTtype != null)
				return false;
		} else if (!gSTtype.equals(other.gSTtype))
			return false;
		if (invoiceDate == null) {
			if (other.invoiceDate != null)
				return false;
		} else if (!invoiceDate.equals(other.invoiceDate))
			return false;
		if (invoiceID != other.invoiceID)
			return false;
		if (orderID != other.orderID)
			return false;
		if (productsWithGST == null) {
			if (other.productsWithGST != null)
				return false;
		} else if (!productsWithGST.equals(other.productsWithGST))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (totalValue != other.totalValue)
			return false;
		return true;
	}

}
