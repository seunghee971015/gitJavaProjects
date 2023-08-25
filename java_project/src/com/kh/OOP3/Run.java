package com.kh.OOP3;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//	  int형변수 num을 입력받으세요
//	  num이 홀수이면 홀수입니다. 짝수면 짝수입니다를 출력
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		if(num % 2 == 1) {
//			System.out.println("홀수입니다");
//		}else if(num > 0 && num % 2 == 0) {
//			System.out.println("짝수입니다");
//		}
//		int sum = 0;
      //1부터 num까지 모두 더한 합을 구해서 출력
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
	
	
  //num크기의 int형 배열을 만들고 0~(num - 1)까지의 인덱스에 1~num까지의 숫자를 저장하고
  //모든 배열에 저장이 잘 되었는지 출력
//		int[] arr = new int[num];
//		for(int i =0; i <= arr.length - 1; i++) {
//			arr[i] = i + 1;
//		}
//		for(int i =0; i <= arr.length - 1; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
//		for(int i = 0; i <= arr.length - 1; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + "\t");
//		}
//		System.out.println();
      //메인문에서 각각 객체를 하나 만들고 테스트 실행
		Animal bird = new Bird("파랑새", 47);
		bird.makeSound();
		((Bird)bird).fly();
		
		Animal fish = new Fish("광어", 38);
		fish.makeSound();
		((Fish)fish).swim();
		
	}
}
