package com.lastminute.api;

public class Product {
	private static final String[] EXEMPTION_KEYWORDS = {"book", "food", "medical", "pill"};
	
	private String name;
	private boolean exemption;
	private boolean imported;
	
	
	public static Product get(String name, boolean basicTaxExempted, boolean imported){
		return new Product(name, basicTaxExempted, imported);
	}
	
	public static Product getInferringExemption(String name, boolean imported){
		return new Product(name, isExempted(name), imported);
	}
	
	static boolean isExempted(String name){
		for(int i=0; name!= null && i< EXEMPTION_KEYWORDS.length; i++){
			if(name.indexOf(EXEMPTION_KEYWORDS[i])>=0){
				return true;
			}
		}
		return false;
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
