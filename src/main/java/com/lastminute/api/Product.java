package com.lastminute.api;

public class Product {
	private String name;
	private boolean exemption;
	private boolean imported;
	
	public static Product build(String name, boolean exemption, boolean imported){
		return new Product(name, exemption, imported);
	}
	
	private Product(String name, boolean exemption, boolean imported) {
		this.name = name;
		this.exemption = exemption;
		this.imported = imported;
	}

	public String getName() {
		return name;
	}

	public boolean isExempted() {
		return exemption;
	}

	public boolean isImported() {
		return imported;
	}
}
