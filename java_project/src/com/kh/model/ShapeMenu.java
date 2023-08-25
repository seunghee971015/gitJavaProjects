package com.kh.model;
import java.util.Scanner;

public class ShapeMenu {
	private Scanner sc;
	private SquareController scr;
	private TriangleController tc;

	public ShapeMenu() {
		sc = new Scanner(System.in);
		scr = new SquareController();
		tc = new TriangleController();
	}

	public void inputMenu() {
		while (true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			if (menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menuNum == 3) {
				triangleMenu();
			} else if (menuNum == 4) {
				squareMenu();
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	public void triangleMenu() {
		while (true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

		    if (menuNum == 1 || menuNum == 2) {
                inputSize(3, menuNum);
            } else if (menuNum == 3) {
                printInformation(3);
            } else if (menuNum == 9) {
                System.out.println("메인으로 돌아갑니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
		}
	}

	public void squareMenu() {
		while (true) {
            System.out.println("===== 사각형 =====");
            System.out.println("1. 사각형 둘레");
            System.out.println("2. 사각형 면적");
            System.out.println("3. 사각형 색칠");
            System.out.println("4. 사각형 정보");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호: ");
            int menuNum = sc.nextInt();

            if (menuNum == 1 || menuNum == 2 || menuNum == 3) {
                inputSize(4, menuNum);
            } else if (menuNum == 4) {
                printInformation(4);
            } else if (menuNum == 9) {
                System.out.println("메인으로 돌아갑니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }
	}

	public void inputSize(int type, int menuNum) {
        if (type == 3) { 
            if (menuNum == 1) {
                System.out.print("높이: ");
                double height = sc.nextDouble();
                System.out.print("너비: ");
                double width = sc.nextDouble();
                double area = tc.calcArea(height, width);
                System.out.println("삼각형 면적: " + area);
            } else if (menuNum == 2) {
                System.out.print("색깔을 입력하세요: ");
                String color = sc.next();
                tc.paintColor(color);
                System.out.println("색이 수정되었습니다.");
            }
        } else if (type == 4) { 
            System.out.print("높이: ");
            double height = sc.nextDouble();
            System.out.print("너비: ");
            double width = sc.nextDouble();
            if (menuNum == 1) {
                double perimeter = scr.calcPerimeter(height, width);
                System.out.println("사각형 둘레: " + perimeter);
            } else if (menuNum == 2) {
                double area = scr.calcArea(height, width);
                System.out.println("사각형 면적: " + area);
            } else if (menuNum == 3) {
                System.out.print("색깔을 입력하세요: ");
                String color = sc.next();
                scr.paintColor(color);
                System.out.println("색이 수정되었습니다.");
            }
        }
    }

    public void printInformation(int type) {
        if (type == 3) { 
            System.out.println(tc.print());
        } else if (type == 4) { 
            System.out.println(scr.print());
        }
    }

	public static void main(String[] args) {
		ShapeMenu shapeMenu = new ShapeMenu();
		shapeMenu.inputMenu();
	}
}
