package com.lastminute.api;

import java.math.BigDecimal;

public class TaxCalculator {
	private static final double BASIC_TAX = 10;
	private static final double IMPORT_TAX = 5;
	private static final int MAX_DEC = 2;
	private static final double ROUND_FACTOR = 0.05;
	
	public static double getTax(ReceiptItem item){
		double tax = 0;
		if(!item.getProduct().isExempted()){
			double basicTax = roundOff(item.getPrice()*item.getQuantity() * BASIC_TAX / 100);
			tax += basicTax;
		}
		
		if(item.getProduct().isImported()){
			double importTax = roundOff(item.getPrice()*item.getQuantity() * IMPORT_TAX / 100);
			tax += importTax;
		}
		
		return tax;
	}

	static double roundOff(Double in) {
		return round(Math.ceil(in / ROUND_FACTOR) * ROUND_FACTOR);
	}
	
	static double round(Double in) {
		return new BigDecimal(in.toString()).setScale(MAX_DEC, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
}
