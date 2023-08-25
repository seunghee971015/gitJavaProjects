package com.kh.assignment0819;

public class Book {
	private int code;
	   private String title;
	   private String author;
	   
	   public Book(int code, String title, String author) {
	      this.code = code;
	      this.title = title;
	      this.author = author;
	   }
	   
	   public int getCode() {
	      return code;
	   }
	   public void setCode(int code) {
	      this.code = code;
	   }
	   public String getTitle() {
	      return title;
	   }
	   public void settitle(String title) {
	      this.title = title;
	   }
	   public String getAuthor() {
	      return author;
	   }
	   public void setAuthor(String author) {
	      this.author = author;
	   }
	   public String toString() {
	      return this.code+"\t"+this.title+"\t"+this.author;
	   }


}
