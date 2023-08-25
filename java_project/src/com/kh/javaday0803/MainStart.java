package com.kh.javaday0803;

import java.util.Scanner;

public class MainStart {
	
	public static void main(String[] args) {
		
//		int num;
//		System.out.println("정수 : ");
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		
//		if(num %2 ==0) {
//			System.out.print("짝수입니다");
//		}else {
//			System.out.print("홀수입니다");
//		}
//		
//		
//		int num2;
//		System.out.print("정수 : ");
//		num2 = sc.nextInt();
//		
//		if (num2 < 1 || num2 > 50) {
//			System.out.print("1~50사이의 정수를 입력해주세요");
//		
//		}else {	for(int i = 1; i <= num2; i++) {
//			System.out.println(i);
//			}
//		}
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 11;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
