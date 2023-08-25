package com.kh.extendsjava;
import java.util.Scanner;


public class MainStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//클래스이름[] 객체배열이름 = new 클래스이름[크기];
		Human[] humanList = new Human[10];
		humanList[0] = new Human("김사랑", "남자", 27, 72.9); 
	
		//입력받아서 생성
		String name, gender;
		int age;
		double weight;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		weight = sc.nextDouble();
		
		humanList[1] = new Human(name, gender, age, weight);
		
		
//		//전체 출력
		System.out.println("이름\t성별\t나이\t몸무게");
		for(int i = 0; i < humanList.length; i++) {
			if(humanList[i] == null) {
				break;
			}
			System.out.println(humanList[i].toString());
		}
//		
//		//삭제
//		for(int i = humanList.length-1; i >= 0; i--) {
//			if(humanList[i] != null) {
//				System.out.println(humanList[i].toString());
//				humanList[i] = null;
//				break;
//			}
//			
//		}
//		System.out.print("모든 값이 null로 초기화 되었습니다");
		
//		System.out.println("이름\t성별\t나이\t몸무게");
//		for(int i = 0; i < humanList.length; i++) {
//			if(humanList[i] == null) {
//				break;
//			}
//			System.out.println(humanList[i].toString());
//		}
		
		
		for(int i = humanList.length-1; i >= 0; i--) {
			if(humanList[i] != null) {
				System.out.println(humanList[i].toString());
				humanList[i] = null;
				break;
			}
		}
		System.out.print("위의 회원 정보를 삭제합니다");
		
	}

}
