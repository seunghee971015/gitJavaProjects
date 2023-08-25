package com.kh.friend;

public class CompFriend extends Friend {
	private String department;
	
	public CompFriend(String name, String department, String phone) {
		super(name, phone);
		this.department = department;
	}

	public void showInfo() {
		super.showInfo();
		this.department = department;
		System.out.println("부서 :" + department);
	}
}
