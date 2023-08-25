package com.kh.java0809;
import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
		//메뉴 생성, 삭제, 수정, 조회, 전체출력
		
		while(pos.getIsRun()) {
			int number = pos.printMenu();
			switch(number) {
				case 1:{ // 생성
					pos.insertMenu();
				}break;
				case 2:{//수정
					pos.updateDrinkUnit();
				}break;
				case 3:{//조회
					pos.searchDrinkUnit();
				}break;
				case 4:{//삭제
					pos.deleteDrinkUnit();
				}break;
				case 5:{//전체메뉴확인
					pos.printDrinkArr();
				}break;
				default:
					pos.setIsRun(false);
			}
		}
//		final int MAX = 20;
//		Product[] menuArr = new Product[MAX];
//	
//		String name, description;
//		int price;
//		
//		System.out.print("음료명을 입력하세요 : ");
//		name = sc.next();
//		System.out.print("금액을 입력하세요 : ");
//		price = sc.nextInt();
//		System.out.print("설명을 입력하세요 : ");
//		description = sc.next();
		
		
		
		
//		for(int i = 0; i < menuArr.length; i++) {
//			
//			if(menuArr[i] == null) {//객체 자리가 비어있니?
//				menuArr[i] = new Product(name, price, description);
//				   System.out.println(menuArr[i].getName() + "가 메뉴에 추가되었습니다.");
//					break;
//				}else if(menuArr[i].getName().equals(name)) {// 객체에 이름데이터의 값이 입력받은 이름과 같니?
//				   menuArr[i] = new Product(name, price, description);
//				   
//				   System.out.print(name + "은 이미 등록되어있습니다.");
//				   break;
//				} else if(i == menuArr.length - 1) {// 마지막까지 확인이 끝났니?
//					System.out.println("더 이상 메뉴를 추가할 수 없습니다.");
//				}
//			}
//		
//		System.out.println("메뉴명\t가격\t설명");
//		for(int i = 0; i < menuArr.length; i++) {
//			if(menuArr[i] == null) {
//				System.out.println(i + "\t-\t-\t");
//			}else {
//				System.out.println(i + "\t" + menuArr[i].toString());
//			}
//		}
////		for(int i = menuArr.length - 1; i >= 0; i--) {
////			if (menuArr[i] != null ) {
////				System.out.print(menuArr[i].getName() + "가 메뉴에서 삭제되었습니다.");
////				menuArr[i] = null;
////				break;
////			} else if(i == 0) {
////				System.out.print("삭제할 메뉴가 존재하지않습니다.");
////			}
////		}
//		
////		System.out.print("조회할 메뉴의 이름을 입력하세요 : ");
////		String tName = sc.next();
////		for(int i = 0; i < menuArr.length; i++) {
////			if(menuArr[i] == null) {
////				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
////				break;
////			}else if(menuArr[i].equals(tName)) {
////				System.out.println(i + "\t" + menuArr[i].toString());
////				break;
////			}else if(i == menuArr.length - 1) {
////				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
////			}
////
////		}
//		
//		Product selectMenu;
//		
//		int num;
//		
//		System.out.print("수정할 메뉴의 번호를 입력하세요 : ");
//		num = sc.nextInt();
//		selectMenu = menuArr[num];
//		
//		if(selectMenu == null) {
//			System.out.print("해당 번호의 메뉴가 존재하지 않습니다. ");
//		}else {
//			System.out.print("새로운 이름을 입력하세요 : ");
//			switch(sc.next()) {
//				case "이름":
//					sc.nextLine();
//					System.out.print("새로운 이름을 입력하세요 : ");
//					selectMenu.setName(sc.next());
//					System.out.println(num + "\t" + selectMenu.toString());
//					break;
//				case "가격":
//					System.out.print("새로운 가격 입력하세요 : ");
//					selectMenu.setPrice(sc.nextInt());
//					System.out.println(num + "\t" + selectMenu.toString());
//					break;
//				case "설명":
//					sc.nextLine();
//					System.out.print("새로운 설명 입력하세요 : ");
//					selectMenu.setDescription(sc.nextLine());
//					System.out.println(num + "\t" + selectMenu.toString());
//					break;
//				default:
//					System.out.print("잘못입력하였습니다. ");
//			}
//		}
		
		
		
		
	}
	
}
