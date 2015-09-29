package com.lastminute.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void checkExemption() {
		assertEquals(true, FakeProduct.get("book of the books").isExempted());
		assertEquals(false, FakeProduct.get("bottle of perfume").isExempted());
		assertEquals(true, FakeProduct.get("packet of headache pills").isExempted());
	}
	
	@Test
	public void checkImportation() {
		assertEquals(true, FakeProduct.get("imported").isImported());
		assertEquals(false, FakeProduct.get("no").isImported());
	}

}
