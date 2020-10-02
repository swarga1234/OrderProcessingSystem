package com.hsbc.model;
/*
 * @author shubham_kumar
 */
import java.util.Objects;

public final class Product {
	private final int productId;
	private String productName;
	private double price;
	private int productCategory;

	public Product(int productId, String productName, double price, int productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.productCategory = productCategory;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName to set the productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price to set the price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the productCategory
	 */
	public int getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory to set the productCategory
	 */
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", productCategory=" + productCategory + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return productId == other.productId;
	}

}
