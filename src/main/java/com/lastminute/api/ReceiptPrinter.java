package com.lastminute.api;

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class ReceiptPrinter {
	private final NumberFormat COST_FORMAT = new DecimalFormat("0.00");
	private final Receipt receipt;
	
	public ReceiptPrinter(Receipt receipt){
		this.receipt = receipt;
	}
	
	public String format(){
		String tmp = "";
		final char CR = '\n';
		
		List<ReceiptItem> items = receipt.getItems();
		for (ReceiptItem it : items) {
			tmp+= it.getQuantity() + " "+ it.getProduct().getName() + ": " + COST_FORMAT.format(it.getTotalCost()) + CR;
		}
		
		tmp += "Sales Taxes: " + COST_FORMAT.format(receipt.getSalesTaxes()) + CR;
		tmp += "Total: " + COST_FORMAT.format(receipt.getTotalCost()) + CR;
		
		return tmp;
	}
	
	public void print(PrintWriter out){
		out.print(format());
	}
}
