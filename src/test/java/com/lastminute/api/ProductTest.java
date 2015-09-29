package com.lastminute.api;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {

	@Test
	public void checkExemption() {
		assertEquals(true, FakeProduct.build("book of the books").isExempted());
		assertEquals(false, FakeProduct.build("bottle of perfume").isExempted());
		assertEquals(true, FakeProduct.build("packet of headache pills").isExempted());
	}
	
	@Test
	public void checkImportation() {
		assertEquals(true, FakeProduct.build("imported").isImported());
		assertEquals(false, FakeProduct.build("no").isImported());
	}

}
