package com.lastminute.api;

class FakeProduct  {
	private static final String[] EXEMPTION_KEYWORDS = {"book", "food", "medical", "pill", "chocolate"};
	private static final String[] IMPORTED_KEYWORDS = {"imported"};
	
	static Product build(String name){
		return Product.build(name, containsKeyword(name, EXEMPTION_KEYWORDS), containsKeyword(name, IMPORTED_KEYWORDS));
	}
	
	private static boolean containsKeyword(String name, String[] keywords){
		for(int i=0; name!= null && i< keywords.length; i++){
			if(name.toLowerCase().indexOf(keywords[i])>=0){
				return true;
			}
		}
		return false;
	}
}
