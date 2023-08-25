package com.kh.shoes;

public class ShoesController {
	private Shoes s = new Shoes();
	
	
	public void order(String brand, String kind, String color, int quantity, int size) {
		s = new Shoes(brand, kind, color, quantity, size);
		System.out.print("주문이 완료되었습니다.");
	}
	public void add(String brand, String kind, String color, int quantity, int size) {
		s = new Shoes(brand, kind, color, quantity, size);
		System.out.print("주문이 추가되었습니다.");
	}
	
	public Shoes remove() {
		s = null;
		return s;
	}
}
