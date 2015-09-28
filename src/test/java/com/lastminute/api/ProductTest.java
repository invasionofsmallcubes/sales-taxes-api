package com.lastminute.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void checkExemption() {
		assertEquals(true, Product.getInferring("book of the books").isExempted());
		assertEquals(false, Product.getInferring("bottle of perfume").isExempted());
		assertEquals(true, Product.getInferring("packet of headache pills").isExempted());
	}
	
	@Test
	public void checkImportation() {
		assertEquals(true, Product.getInferring("imported").isImported());
		assertEquals(false, Product.getInferring("no").isImported());
	}

}
