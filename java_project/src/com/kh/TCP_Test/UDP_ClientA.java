package com.kh.TCP_Test;
import java.io.*;
import java.net.*;

public class UDP_ClientA {
   public static void main(String[] args) {
      System.out.print("Client A");
      
      DatagramSocket ds = null;
      
      try {
         ds = new DatagramSocket(10000);
      } catch(SocketException e) {
         e.printStackTrace();
      }
      
      InetSocketAddress is = new InetSocketAddress("localhost", 20000);
      
      byte[] sendData = "안녕하세요".getBytes();
      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, is);
      
      System.out.println("발송 데이터 : " + new String(sendPacket.getData(), sendPacket.getOffset(), sendPacket.getLength()));
      
      try {
         ds.send(sendPacket);
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      byte[] receiveData = new byte[65000];
      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
      try {
         ds.receive(receivePacket);
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      System.out.println("수신 데이터 : " + new String(receivePacket.getData(), receivePacket.getOffset(), receivePacket.getLength()));
   }
}
