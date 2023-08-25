package com.kh.io;
import java.io.*;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String filePath = "myFile.txt";
		
		try {
			File file = new File(filePath);
			boolean isFileCreated = file.createNewFile();
			
			if(isFileCreated) {
				System.out.print("파일 생성 완료 : " + filePath);
			} else {
				System.out.print("파일 생성 실패");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream out = new FileOutputStream(filePath);
			out.write(7);;
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			InputStream in = new FileInputStream(filePath);
			System.out.print(in.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//내보낼때는 OutputStream
	//입력할때는 InputStream

}
