package com.kh.review;

public class Tea {
	private int price;
	private String ingredient;
	
	public Tea() {
		
	}
	
	public Tea(int price, String ingredient) {
		this.price = price;
		this.ingredient = ingredient;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice() {
		this.price = price;
	}
	public String getIngredient() {
		return this.ingredient;
	}
	public void setIngredient() {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return this.price + this.ingredient;
	}
	
	

}
