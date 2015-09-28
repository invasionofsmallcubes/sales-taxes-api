package com.lastminute.api;

public class Product {
	private static final String[] EXEMPTION_KEYWORDS = {"book", "food", "medical", "pill"};
	private static final String[] IMPORTED_KEYWORDS = {"imported"};
	
	private String name;
	private boolean exemption;
	private boolean imported;
	
	public static Product get(String name, boolean basicTaxExempted, boolean imported){
		return new Product(name, basicTaxExempted, imported);
	}
	
	//package visibility, just for test purposes
	static Product getInferring(String name){
		return new Product(name, containsKeyword(name, EXEMPTION_KEYWORDS), containsKeyword(name, IMPORTED_KEYWORDS));
	}
	
	private static boolean containsKeyword(String name, String[] keywords){
		for(int i=0; name!= null && i< keywords.length; i++){
			if(name.toLowerCase().indexOf(keywords[i])>=0){
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
