package com.kh.iclass;

//접근지정자 class 클래스이름{}
class Product{
	//필드(데이터영역)
	//변수를 필요한만큼 생성한다.
	private String name;
	private int price;
	private int count;
	
	//메서드(기능영역)
	//매서드 작성방법
	//접근제한자 반환자료형 메서드이름(매개변수){ }
	
	//생성자 => 데이터 필드를 초기화 시키기 위해서 생성시에 한번만 호출되는 특수한 메서드
	//class와 이름이 똑같은 베서드로 반환형을 가지고 있지 않다.
	//개발자가 직접 만들어주지 않으면 기본생성자는 내부적으로 컴파일러가 만들어준다.
//	public Product() {
//		
//	}
	
	//매개변수의 개수나 타입에 따라서 여러개를 생성할 수 있다.
	//단 생성자를 직접 적어주면 기본생성자는 자동생성되지 않는다.
	public Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	
	//사용자 입장에서 변수를 바꾸게하지 못하도록 set으로 설정해서 세팅해줌
	//필드에 있는 변수를 세팅하는 기능
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		if (price < 0) {
			this.price = 0;
		}else {
			this.price = price;
		}
	}
	
	public void setCount(int count) {
		if (count < 0) {
			this.count = 0;
		}else {
			this.count = count;
		}
	}
	
	//사용자 입장에서 변수를 바꾸게하지 못하도록 get으로 설정해서 가지고올수 있게 함
	//필드에 있는 변수를 가지고 오는 기능
	// 메서드 생성 방법 : 접근제한자 반환자료형 메서드이름(매개변수){ 실행할 코드 }
	public String getName() {
		 return this.name;
	}
	
	public int getPrice() {
		 return this.price;
	}
	
	public int getCount() {
		 return this.count;
	}
	
	public void productInfo() {
		System.out.println(getName() + " 잔당 " + getPrice() + "원에 " + getCount() + "잔 팝니다.");
	}
	
	//제품가격에 특정 값을 매개변수로 넘겨받아서 합한 값을 리턴해주는 메서드
	// 메서드 생성 방법 : 접근제한자 반환자료형 메서드이름(매개변수){ 실행할 코드 }
	public int addPrice(int plusPrice) {
		return this.price + plusPrice;
	}
	
}