package com.kh.shoes;

import java.util.Scanner;

public class ShoesMenu {
	private Scanner sc = new Scanner(System.in);
    private ShoesController shc = new ShoesController();
    
    public ShoesMenu() {
    	
    }
    
    public void orderProduct() {
    	
    	while(true) {
	    	int orderNum; 
	    	
	    	System.out.println("1. 주문하기 : ");
	    	System.out.println("2. 주문추가 : ");
	    	System.out.println("3. 주문취소 : ");
	    	orderNum = sc.nextInt();
	    	sc.nextLine();
	    	
	    	switch(orderNum) {
		    	case 1:{
		    		orderComplete();
		    	}break;
		    	case 2:{
		    		orderAdd();
		    	}break;
		    	case 3:{
		    		orderRemove();
		    	}break;
		    	default:
		    		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
	    		
	    	}
	    	
	    	
	    }
    }
    public void orderComplete() {
    	String brand, kind, color;
    	int quantity, size;
    	
    	System.out.print("구매할 브랜드명 : ");
    	brand = sc.next();
    	System.out.print("종류 : ");
    	kind = sc.next();
    	System.out.print("색깔 : ");
    	color = sc.next();
    	System.out.print("사이즈 : ");
    	size = sc.nextInt();
    	System.out.print("수량 : ");
    	quantity = sc.nextInt();
    	
    	shc.order(brand,kind, color, quantity, size);
    }
    public void orderAdd() {
    	
    }
    public void orderRemove() {
	
    }

}
