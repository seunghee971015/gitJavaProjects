package com.kh.assignment0819;
import java.util.Scanner;

public class Run {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int num;
	      
	      //스캐너로 입력받으면 입력받기 전까지 무조건 멈춰있음
	      while(true){
	         System.out.print("정수 : ");
	         num = sc.nextInt();
	         if(num < 100) {
	            System.out.println("100이하");
	            break;
	         }else if(num >= 100) {
	            System.out.println("100을 초과하였습니다,다시 입력해주세요");
	         }
	      }
	      
	      int sum = 0;
	      for(int i = 1; i <= num; i++) {
	         sum = sum + i;
	      }System.out.print(sum);
	      
	      int[]arr = new int[100];
	      num = sc.nextInt();
	      for(int i = 0; i < num; i++) {
	         arr[i] = i + 1;
	      }for(int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      
	      Book[] bookList = new Book[10];
	      bookList[0] = new Book(3840, "코스모스", "칼세이건");
	      bookList[1] = new Book(5955, "코리모리", "김영희");
	      bookList[2] = new Book(5556, "아카수우", "최철수");
	      bookList[3] = new Book(5151, "롱맨사전", "Cambridge");
	      bookList[4] = new Book(9566, "맹자", "맹자");
	      bookList[5] = new Book(6622, "공자", "공자");
	      bookList[6] = new Book(8484, "미국문화", "박현성");
	      bookList[7] = new Book(9898, "오셀로", "셰익스피어");
	      bookList[8] = new Book(1122, "햄릿", "셰익스피어");
	      bookList[9] = new Book(5566, "코딩의정석", "최지원");
	      
	      System.out.println(bookList[0].toString());
	      System.out.println(bookList[1].toString());
	      System.out.println(bookList[2].toString());
	      System.out.println(bookList[3].toString());
	      System.out.println(bookList[4].toString());
	      System.out.println(bookList[5].toString());
	      System.out.println(bookList[6].toString());
	      System.out.println(bookList[7].toString());
	      System.out.println(bookList[8].toString());
	      System.out.println(bookList[9].toString());
	      
	      
	      

	   }


}
