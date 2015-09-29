package com.lastminute.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceiptPrinterTest {

	@Test
	public void test() {
		ReceiptPrinter rp = new ReceiptPrinter(OrderUtil.getForOrder3());
		
		String expected = ""+
				"1 imported bottle of perfume: 32.19\n"+
				"1 bottle of perfume: 20.89\n"+
				"1 packet of headache pills: 9.75\n"+
				"1 imported box of chocolates: 11.85\n"+
				"Sales Taxes: 6.70\n"+
				"Total: 74.68\n";
		assertEquals(expected, rp.format()); 
	}

}
