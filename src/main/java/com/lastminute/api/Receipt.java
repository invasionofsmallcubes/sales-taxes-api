package com.lastminute.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Receipt {
	private final List<ReceiptItem> items = new ArrayList<ReceiptItem>();
	private double totalCost;
	private double salesTaxes;
	
	public synchronized void addItem(ReceiptItem item){
		items.add(item);
		updateTotals(item);
	}

	private synchronized void updateTotals(ReceiptItem item) {
		double curCost = item.getPrice() * item.getQuantity();
		
		salesTaxes = TaxCalculator.round(salesTaxes + item.getTax());
		totalCost = TaxCalculator.round(totalCost + curCost + item.getTax());
	}
	
	public List<ReceiptItem> getItems(){
		return Collections.unmodifiableList(items);
	}

	public synchronized double getTotalCost() {
		return totalCost;
	}

	public synchronized double getSalesTaxes() {
		return salesTaxes;
	}
}
