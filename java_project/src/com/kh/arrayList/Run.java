package com.kh.arrayList;
import java.util.*;

public class Run {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //컬렉션 인스턴스 생성
		
		//컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Lego");
		list.add("Snack");
		list.add("Santa");
		
		//저장된 문자열 인스턴스 참조
		for(int i = 0; i <= list.size()-1; i++) {
			System.out.print(list.get(i) + '\t');
			
		}System.out.println();
		
		list.remove(0); //첫 번째 인스턴스 삭제
		
		//첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for(int i = 0; i <= list.size()-1; i++) {
			System.out.print(list.get(i) + '\t');
			
		}System.out.println();
	}

}
