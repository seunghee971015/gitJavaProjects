package com.kh.friend;

public class Friend {
	protected String name;
	protected String phone;
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println("이름 :" + name);
		System.out.println("전화 :" + phone);
		
	}
	

}
