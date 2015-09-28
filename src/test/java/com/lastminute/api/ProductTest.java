package com.lastminute.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void checkExemption() {
		assertEquals(true, Product.get("book of the books").isExempted());
		assertEquals(false, Product.get("bottle of perfume").isExempted());
		assertEquals(true, Product.get("packet of headache pills").isExempted());
	}
	
	@Test
	public void checkImportation() {
		assertEquals(true, Product.get("imported").isImported());
		assertEquals(false, Product.get("no").isImported());
	}

}
