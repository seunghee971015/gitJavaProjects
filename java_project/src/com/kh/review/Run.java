package com.kh.review;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num;
//		double num2;
//		
//		num = sc.nextInt();
//		System.out.println(num);
//		
//		
//		for(int i = 1; i <= num; i++) {
//			if(num %2 == 1) {
//				System.out.print("홀수");
//			}else {
//				System.out.print("짝수");
//			}
//				
//		}
		
		
		
//		while(true) {
//			String str = sc.next();
//			if(str.equals("멈춰")) {
//				break;
//			
//			}
//			System.out.println("다시 입력해주세요");
//		}
		
//		while(true) {
//			System.out.print("문자열을 입력해주세요 :" );
//			String str2 = sc.next();
//			if(str2.length() >= 10)
//				break;
//		}
		
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for(int i = 0; i <= arr.length - 1; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + );
//		}
		
		//class이름 참조변수명 = new 생성자;
//		Human jiwon;
//		jiwon = new Human();
//		
//		Human kim = new Human();
//		
//		jiwon.setName("최지원");
//		System.out.print(jiwon.getName());
		
//		Car ceoCar = new Car("포르쉐","빨강","대표");
//		Car exeCar = new Car("제네시스","검정","임원진");
//		Car empCar = new Car("현대기아","흰색","직원");
//		
//		
//		System.out.println(ceoCar.toString());
//		System.out.println(exeCar.toString());
//		System.out.println(empCar.toString());
		
		
		Human kim = new Human("김소망", 15, "201212-2xxxxxx", 'f');
		Human choi = new Human("최지원", 45, "900525-2xxxxxx", 'f');
		
		Human[] arr = new Human[3];
		
		arr[0] = new Human("김소망", 15, "201212-2xxxxxx", 'f');
		arr[1] = new Human("최지원", 45, "900525-2xxxxxx", 'f');
		
		kim.setName("김씨아님");
		arr[0].setName("사실내가Kim");
		System.out.println(kim.toString());
		System.out.println(arr[0].toString());
		System.out.println(arr[1].toString());
		
		
		
		
		
		
	}

}
