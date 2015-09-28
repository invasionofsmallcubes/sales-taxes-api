package com.lastminute.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void checkExemption() {
		assertEquals(true, Product.getInferringExemption("book of the books", true).isExempted());
		assertEquals(false, Product.getInferringExemption("bottle of perfume", true).isExempted());
		assertEquals(true, Product.getInferringExemption("packet of headache pills", true).isExempted());
	}
	
	@Test
	public void checkImportation() {
		assertEquals(true, Product.getInferringExemption("yes", true).isImported());
		assertEquals(false, Product.getInferringExemption("no", false).isImported());
	}

}
