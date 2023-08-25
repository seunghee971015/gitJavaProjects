package com.kh.snackdiagram;
import java.util.Scanner;

public class SnackMenu {
 	private Scanner sc;
	private SnackController scr;

    public SnackMenu() {
        sc = new Scanner(System.in);
        scr = new SnackController();
    }

    public void menu() {
        System.out.print("종류: ");
        String kind = sc.next();
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("맛: ");
        String flavor = sc.next();
        System.out.print("개수: ");
        int numOf = sc.nextInt();
        System.out.print("가격: ");
        int price = sc.nextInt();

        System.out.println(scr.saveData(kind, name, flavor, numOf, price));
        System.out.println("저장한 정보를 확인하시겠습니까?(y/n) : ");
        if (sc.next().charAt(0) == 'y')
        	System.out.print(scr.confirmData());
        
    }
}
