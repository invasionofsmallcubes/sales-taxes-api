package com.lastminute.api;

public class OrderUtil {
	static Receipt getForOrder1(){
		Receipt r = new Receipt();
		r.addItem(new ReceiptItem(1, FakeProduct.build("book"), 12.49));
		r.addItem(new ReceiptItem(1, FakeProduct.build("music CD "), 14.99));
		r.addItem(new ReceiptItem(1, FakeProduct.build("chocolate bar"), 0.85));
		return r;
	} 
	
	static Receipt getForOrder2(){
		Receipt r = new Receipt();
		r.addItem(new ReceiptItem(1, FakeProduct.build("imported box of chocolates"), 10.00));
		r.addItem(new ReceiptItem(1, FakeProduct.build("imported bottle of perfume"), 47.50));
		return r;
	} 
	
	static Receipt getForOrder3(){
		Receipt r = new Receipt();
		r.addItem(new ReceiptItem(1, FakeProduct.build("imported bottle of perfume"), 27.99));
		r.addItem(new ReceiptItem(1, FakeProduct.build("bottle of perfume"), 18.99));
		r.addItem(new ReceiptItem(1, FakeProduct.build("packet of headache pills"), 9.75));
		r.addItem(new ReceiptItem(1, FakeProduct.build("imported box of chocolates"), 11.25));
		return r;
	} 
}
