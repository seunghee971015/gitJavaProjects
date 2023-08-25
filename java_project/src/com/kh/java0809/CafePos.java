package com.kh.java0809;
import java.util.Scanner;

public class CafePos {
	private static CafePos instance;
	private final int MAX_COUNT = 10;
	private final Product[] DRINK_ARR = new Product[MAX_COUNT];
	private Scanner sc = new Scanner(System.in);
	private boolean isRun = true;
	
	//외부에서 객체를 생성하지 못하도록 생성자의 접근제한자를 private으로 설정
	private CafePos() {
		
	}
	
	public static CafePos getInstance() {
		if (instance == null)
			instance = new CafePos();
		return instance;
	}
	
	public boolean getIsRun() {
		return this.isRun;
	}
	
	public void setIsRun(boolean isRun) {
		this.isRun = isRun;
	}
	
	public int printMenu() {
		System.out.println("------------------------");
		System.out.println("1. 메뉴 생성");
		System.out.println("2. 메뉴 수정");
		System.out.println("3. 메뉴 조회");
		System.out.println("4. 메뉴 삭제");
		System.out.println("5. 전체 메뉴 확인");
		System.out.println("------------------------");
		System.out.print("원하시는 메뉴를 선택해 주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	// 음료명, 금액, 설명을 입력받아 drinkArr에 추가해 보아라
	// 음료명을 입력하세요 : 
	// 금액을 입력하세요 : 
	// 설명을 입력하세요 : 
	// ooo가 메뉴에 추가되었습니다.
	// 또는 ooo은 이미 등록되어있습니다.
	public void insertMenu() {
		String name, description;
		int price;
			
		System.out.print("음료명을 입력하세요 :");
		name = sc.nextLine();
		
		System.out.print("금액을 입력하세요 :");
		price = sc.nextInt();
		
		sc.nextLine();
		System.out.print("설명을 입력하세요 :");
		description = sc.nextLine();
		
		for (int i = 0; i < DRINK_ARR.length; i++) {
		    if (DRINK_ARR[i] == null) { // 객체에 자리가 비어있니?
		    	DRINK_ARR[i] = new Product(name, price, description);
				System.out.println(DRINK_ARR[i].getName() + "가 메뉴에 추가되었습니다.");
				break;
			} else if (DRINK_ARR[i].getName().equals(name)) { // 객체에 이름데이터의 값이 입력받은 이름과 똑같니?
				System.out.println(name + "는(은) 이미 등록되어있습니다.");
				break;
			} else if (i == (DRINK_ARR.length - 1)) { // 마지막까지 확인이 끝났니?
				System.out.println("더이상 메뉴를 추가할 수 없습니다.");
			}
		}
	}
	
	// 음료목록 출력해주세요.
	// 메뉴명 가격 설명
	public void printDrinkArr() {
		System.out.println("번호\t메뉴명\t가격\t설명");
		for (int i = 0; i < DRINK_ARR.length; i++) {
			if (DRINK_ARR[i] == null) {
				System.out.println(i + "\t-\t-\t-");
			} else {
				System.out.println(i + "\t" + DRINK_ARR[i].toString());
			}
		}
	}
	
	// 수정할 메뉴의 번호를 입력하세요 : (번호)
	// 수정할 정보를 입력하세요 : (이름, 가격, 설명)
	// 새로운 oo을 입력하세요 : dddd
	// selectMenu이용해서 해당정보 수정 후 아래와 같이 출력
	// (번호) 아메리카노 1000 시원해요
	public void updateDrinkUnit() {
		printDrinkArr();
		
		Product selectMenu;
		int number;
		System.out.print("수정할 메뉴의 번호를 입력하세요 : ");
		number = sc.nextInt();
		selectMenu = this.DRINK_ARR[number];
		if (selectMenu == null) {
			System.out.println("해당 번호의 메뉴가 존재하지 않습니다.");
		} else {
			System.out.print("수정할 정보를 입력하세요 : ");
			switch(sc.next()) {
				case "이름":
					sc.nextLine();
					System.out.print("새로운 이름을 입력하세요 : ");
					selectMenu.setName(sc.nextLine());
					System.out.println(number + "\t" + selectMenu.toString());
					break;
				case "가격":
					System.out.print("새로운 각격을 입력하세요 : ");
					selectMenu.setPrice(sc.nextInt());
					System.out.println(number + "\t" + selectMenu.toString());
					break;
				case "설명":
					sc.nextLine();
					System.out.print("새로운 설명을 입력하세요 : ");
					selectMenu.setName(sc.nextLine());
					System.out.println(number + "\t" + selectMenu.toString());
					break;
				default: 
					System.out.print("잘못입력하셨습니다.");
			}
		}
	}

	//가장 최신으로 저장된 목록 1개 삭제
	public void deleteDrinkUnit() {
		for (int i = (this.DRINK_ARR.length - 1); i >= 0; i--) {
			if (this.DRINK_ARR[i] != null) {
				System.out.println(this.DRINK_ARR[i].getName() + "가 메뉴가 삭제되었습니다.");
				this.DRINK_ARR[i] = null;
				break;
			} else if (i == 0) {
				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
			}
		}
	}
	
	//조회
	// 조회할 메뉴의 이름을 입력하세요 : 아메리카노
	// 0 아메리카노 1000 시원해요
	// 해당메뉴가 목록에 존재하지 않습니다.
	public void searchDrinkUnit() {
		System.out.print("조회할 메뉴의 이름을 입력하세요 : ");
		String tName = sc.next();
		for (int i = 0; i < this.DRINK_ARR.length; i++) {
			if (this.DRINK_ARR[i] == null) {
				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
				break;
			} else if (this.DRINK_ARR[i].getName().equals(tName)) {
				System.out.println(i + "\t" + this.DRINK_ARR[i].toString());
				break;
			} else if (i == (this.DRINK_ARR.length - 1)) {
				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
			}
		}
	}
}