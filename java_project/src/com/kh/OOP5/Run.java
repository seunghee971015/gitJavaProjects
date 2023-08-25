package com.kh.OOP5;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		if(num > 10) {
//			System.out.println("10 초과");
//		}else if(num <= 10) {
//			System.out.println("10이하");
//		}
//		
//		int value = 1000;
//		
//		for(int i = 1; i <= num; i++) {
//			value -= i;
//			
//		}System.out.println(value);
//		
//		int[] arr = new int[num];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + " ");
//		}
		Human choi = new Student("최지원", 15);
		choi.makeSound();
		((Student)choi).swim();
		
		Human kim = new Student("김민지", 18);
		kim.makeSound();
		((Student)kim).sleep();
		
		
	}

}
