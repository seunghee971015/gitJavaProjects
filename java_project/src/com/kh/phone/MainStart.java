package com.kh.phone;

public class MainStart {

	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777", "Nougat");
		MobilePhone ph2 = new SmartPhone("010-555-777", "Nougat");
		//업캐스팅
		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
		// ph2.playApp();
		
	}

}
