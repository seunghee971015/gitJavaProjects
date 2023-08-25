package com.kh.serialize;
import java.io.File;
import java.io.IOException;

		public class Run {
		   public static void main(String[] args) {
		      String filePath = "myFile.txt";

		      try {
		         File file = new File(filePath);
		         boolean isFileCreated = file.createNewFile();

		         if (isFileCreated) {
		            System.out.println("파일 생성 완료 : " + filePath);
		         } else {
		            System.out.println("파일 생성 실패");
		         }
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		      
		      Person choi = new Person(20, "최지원");
		      choi.saveFile(filePath);
		   
		

	}

}
