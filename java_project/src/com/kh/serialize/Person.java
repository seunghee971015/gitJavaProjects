package com.kh.serialize;
import java.io.*;

public class Person implements Serializable{
   int age;
   String name;
   
   public Person(int age, String name) {
      this.age = age;
      this.name = name;
   }
   
   int getAge() {
      return this.age;
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return "age : " + this.age + "name : " + this.name;
   }
   
   public void saveFile(String fileName) {
      try(FileOutputStream fos = new FileOutputStream(fileName); 
         ObjectOutputStream oos = new ObjectOutputStream (fos)){
         
         oos.writeObject(this);
         
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
   
}