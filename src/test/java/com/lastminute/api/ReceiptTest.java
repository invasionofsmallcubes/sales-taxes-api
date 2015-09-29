package com.lastminute.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceiptTest {
	final double EPSILON = 0;
	
	@Test
	public void checkOrder1() {
		Receipt r = OrderUtil.getForOrder1();
		
		assertEquals(12.49, r.getItems().get(0).getTotalCost(), EPSILON);
		assertEquals(16.49, r.getItems().get(1).getTotalCost(), EPSILON);
		assertEquals(0.85, r.getItems().get(2).getTotalCost(), EPSILON);
		
		assertEquals(1.5, r.getSalesTaxes(), EPSILON);
		assertEquals(29.83, r.getTotalCost(), EPSILON);
	}
	
	@Test
	public void checkOrder2() {
		Receipt r = OrderUtil.getForOrder2();
		
		assertEquals(10.50, r.getItems().get(0).getTotalCost(), EPSILON);
		assertEquals(54.65, r.getItems().get(1).getTotalCost(), EPSILON);
		
		assertEquals(7.65, r.getSalesTaxes(), EPSILON);
		assertEquals(65.15, r.getTotalCost(), EPSILON);
	}
	
	@Test
	public void checkOrder3() {
		Receipt r = OrderUtil.getForOrder3();
		
		assertEquals(32.19, r.getItems().get(0).getTotalCost(), EPSILON);
		assertEquals(20.89, r.getItems().get(1).getTotalCost(), EPSILON);
		assertEquals(9.75, r.getItems().get(2).getTotalCost(), EPSILON);
		assertEquals(11.85, r.getItems().get(3).getTotalCost(), EPSILON);
		
		
		assertEquals(6.70, r.getSalesTaxes(), EPSILON);
		assertEquals(74.68, r.getTotalCost(), EPSILON);
	}
	


}
