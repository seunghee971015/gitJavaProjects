package com.kh.printModel;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc;
	private CircleController cc;
	private RectangleController rc;

	public PointMenu() {
		sc = new Scanner(System.in);
		cc = new CircleController();
		rc = new RectangleController();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("======메뉴======");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
		
			if(num == 9) {
				System.out.print("프로그램을 종료합니다");
				break;
			}else if(num == 1) {
				circleMenu();
			}else if(num == 2) {
				rectangleMenu();
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
		
	}
	public void circleMenu() {
		while(true) {
			System.out.println("======원메뉴======");
			System.out.println("1. 원 둘레 : ");
			System.out.println("2. 원 넓이 :");
			System.out.println("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			if(num == 9) {
				System.out.print("메인으로");
				mainMenu();
			}else if(num == 1) {
				circleMenu();
			}else if(num == 2) {
				rectangleMenu();
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}
		
	}
	public void rectangleMenu() {
	
	}
	public void calcCircumMenu() {
	
	}
	public void calcCircleArea() {
	
	}
	public void calcPerimeter() {
	
	}
	public void calcRectArea() {
		
	}

}
