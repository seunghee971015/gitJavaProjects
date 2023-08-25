package com.kh.iclass;
import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//값을 넣어주는 곳이 매개변수
		//값을 반환해주기 위해 반환형을 쓴다
		//class사용해서 객체배열 만드는 방법
		// 1)class이름[] 객체배열이름 = new class이름[길이];
		//=> 위처럼 작성시 객체배열이 생성은 되지만 비어있는 상태;
		Product[] drinkList =  new Product[2];
		//실제 객체를 만드는 방법
		// 2) 객체배열이름[index] = new class이름(매개변수);
		drinkList[0] = new Product("아메리카노", 1000, 10);
		drinkList[1] = new Product("카페라떼", 2000, 10);
		
		drinkList[0].productInfo();
		drinkList[1].productInfo();
		
//		// 클래스 생성방법 : class이름 객체이름 = new class이름();
//		Product iceAme; //참조변수만 만들어진 상태(리모컨만 들고있는 상태)
//		iceAme =  new Product("아메리카노", 1000, 10);// 참조변수가 메모리공간의 주소값을 가지고 있는 상태(리모컨을 제품에 연결한 상태)
		// = Product iceAme = new Product("아메리카노", 1000, 10);
////		iceAme.getName();
//		
//		Product iceLatte;
//		iceLatte = new Product("카페라떼", 2000, 10);
//		
//		iceAme.productInfo();
//		iceLatte.productInfo();
//		
		//객체안에 매개변수의 값을 모르니깐 매개변수의 값부터 따져야함
//		System.out.print(iceAme.addPrice(iceLatte.getPrice()));
		
//		String name;
//		int price;
//		int count;
//		
//		System.out.print("상품명을 입력하세요.");
//		name = sc.next();
//		System.out.print("상품의 가격을 입력하세요.");
//		price = sc.nextInt();
//		System.out.print("상품의 재고를 입력하세요.");
//		count = sc.nextInt();
		
		//객체배열 생성하는 방법
				//클래스이름[] 객체이름 = new 클래스이름[길이]
				//객체이름[index] = new 클래스이름(매개변수);
	}

}

