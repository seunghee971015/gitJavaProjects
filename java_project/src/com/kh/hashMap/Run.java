package com.kh.hashMap;
import java.util.*;

public class Run {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//key-value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		//데이터 탐색
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));
		System.out.println();
		
		Set<Integer> ks = map.keySet();
		for(Integer n : ks)
			System.out.print(map.get(n) + "\t");
		
		
		
	}

}
