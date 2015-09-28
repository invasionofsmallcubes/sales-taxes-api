package com.lastminute.api;

public class ReceiptItem {
	private int quantity;
	private Product product;
	private double price;
	private double tax;
	private double totalCost;
	
	public ReceiptItem(int quantity, Product product, double price) {
		this.quantity = quantity;
		this.product = product;
		this.price = price;
		this.tax = TaxCalculator.getTax(this);
		this.totalCost = TaxCalculator.round(price * quantity + tax);
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double getPrice() {
		return price;
	}
	
	public double getTax(){
		return tax;
	}
	
	public double getTotalCost(){
		return totalCost;
	}

}
