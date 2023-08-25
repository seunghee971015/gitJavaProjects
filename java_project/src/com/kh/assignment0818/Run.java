package com.kh.assignment0818;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1번
		//크기가 5인 Human 객체배열 arr을 만들고
		//마음대로 데이터를 넣어서 5개 전부 생성해라
		//전부 toString으로 출력하기
		
		//2번
		//위와 똑같은 행위를 하지만 데이터를 전부 사용자로부터 입력 받아 생성해라
		
//		Human[] arr = new Human[5];
//		arr[0] = new Human("권지용", 35,'남',"인플루언서");
//		arr[1] = new Human("동영배", 26,'남',"의사");
//	    arr[2] = new Human("강대성", 22,'여',"변호사");
//	    arr[3] = new Human("최승현", 29,'남',"개발자");
//	    arr[4] = new Human("이승현", 38,'여',"선생님");
//		
//	    System.out.println(arr[0].toString());
//	    System.out.println(arr[1].toString());
//	    System.out.println(arr[2].toString());
//	    System.out.println(arr[3].toString());
//	    System.out.println(arr[4].toString());

	    
		Human[] arr = new Human[5];
	    
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.print("이름 : ");
		    String name = sc.next();
		    System.out.print("나이 : ");
		    int age = sc.nextInt();
		    System.out.print("성별(한글자로) : ");
		    char gender = sc.next().charAt(0);
		    System.out.print("직업 : ");
		    String job = sc.next();
		    
		    arr[i] = new Human(name, age, gender, job);
		    
		    } for(int i = 0; i < arr.length; i++) {
		    		System.out.println(arr[i]);
		    }
	    
	    
	    
	}

}
