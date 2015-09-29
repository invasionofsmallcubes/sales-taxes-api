package com.lastminute.api;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.junit.Test;

public class ReceiptPrinterTest {
	private static final char DEC;
	
	static{
		DecimalFormat format = (DecimalFormat) DecimalFormat.getInstance();
		DecimalFormatSymbols symbols = format.getDecimalFormatSymbols();
		DEC = symbols.getDecimalSeparator();
	}


	@Test
	public void test() {
		ReceiptPrinter rp = new ReceiptPrinter(OrderUtil.getForOrder3());

		String expected = ""+
				"1 imported bottle of perfume: 32"+DEC+"19\n"+
				"1 bottle of perfume: 20"+DEC+"89\n"+
				"1 packet of headache pills: 9"+DEC+"75\n"+
				"1 imported box of chocolates: 11"+DEC+"85\n"+
				"Sales Taxes: 6"+DEC+"70\n"+
				"Total: 74"+DEC+"68\n";
		assertEquals(expected, rp.format()); 
	}

}
