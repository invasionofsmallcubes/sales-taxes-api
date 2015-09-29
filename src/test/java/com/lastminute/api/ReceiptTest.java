package com.lastminute.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceiptTest {
	final double EPSILON = 0;
	
	@Test
	public void checkOrder1() {
		Receipt r = getForOrder1();
		
		assertEquals(12.49, r.getItems().get(0).getTotalCost(), EPSILON);
		assertEquals(16.49, r.getItems().get(1).getTotalCost(), EPSILON);
		assertEquals(0.85, r.getItems().get(2).getTotalCost(), EPSILON);
		
		assertEquals(1.5, r.getSalesTaxes(), EPSILON);
		assertEquals(29.83, r.getTotalCost(), EPSILON);
	}
	
	@Test
	public void checkOrder2() {
		Receipt r = getForOrder2();
		
		assertEquals(10.50, r.getItems().get(0).getTotalCost(), EPSILON);
		assertEquals(54.65, r.getItems().get(1).getTotalCost(), EPSILON);
		
		assertEquals(7.65, r.getSalesTaxes(), EPSILON);
		assertEquals(65.15, r.getTotalCost(), EPSILON);
	}
	
	@Test
	public void checkOrder3() {
		Receipt r = getForOrder3();
		
		assertEquals(32.19, r.getItems().get(0).getTotalCost(), EPSILON);
		assertEquals(20.89, r.getItems().get(1).getTotalCost(), EPSILON);
		assertEquals(9.75, r.getItems().get(2).getTotalCost(), EPSILON);
		assertEquals(11.85, r.getItems().get(3).getTotalCost(), EPSILON);
		
		
		assertEquals(6.70, r.getSalesTaxes(), EPSILON);
		assertEquals(74.68, r.getTotalCost(), EPSILON);
	}
	
	private Receipt getForOrder1(){
		Receipt r = new Receipt();
		r.addItem(new ReceiptItem(1, FakeProduct.get("book"), 12.49));
		r.addItem(new ReceiptItem(1, FakeProduct.get("music CD "), 14.99));
		r.addItem(new ReceiptItem(1, FakeProduct.get("chocolate bar"), 0.85));
		return r;
	} 
	
	private Receipt getForOrder2(){
		Receipt r = new Receipt();
		r.addItem(new ReceiptItem(1, FakeProduct.get("imported box of chocolates"), 10.00));
		r.addItem(new ReceiptItem(1, FakeProduct.get("imported bottle of perfume"), 47.50));
		return r;
	} 
	
	private Receipt getForOrder3(){
		Receipt r = new Receipt();
		r.addItem(new ReceiptItem(1, FakeProduct.get("imported bottle of perfume"), 27.99));
		r.addItem(new ReceiptItem(1, FakeProduct.get("bottle of perfume"), 18.99));
		r.addItem(new ReceiptItem(1, FakeProduct.get("packet of headache pills"), 9.75));
		r.addItem(new ReceiptItem(1, FakeProduct.get("box of imported chocolates"), 11.25));
		return r;
	} 

}
