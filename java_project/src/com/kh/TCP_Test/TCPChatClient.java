package com.kh.TCP_Test;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TCPChatClient {
   public static void main(String[] args) {
      System.out.println("Client Start");
      Scanner sc = new Scanner(System.in);
      BufferedReader br = null;
      PrintWriter pw = null;

      try {
         // 소켓생성 원격아이피와 원격포트이용
         Socket socket = new Socket("127.0.0.1", 5000);
         System.out.println("서버 접속 완료");
         System.out.println("접속 Server 주소 : " + socket.getInetAddress() + " : " + socket.getPort());

         // 읽고쓰기를 하기위한 데이터 인풋스트림과 아웃풋스트림
         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         pw = new PrintWriter(socket.getOutputStream());

         do {
            System.out.print("전송할 메세지 : ");
            String sendMessage = sc.nextLine();

            pw.println(sendMessage);
            System.out.print("전송");
            pw.flush();
            System.out.println(br.readLine());

            if (sendMessage.equals("exit")) {
               br.close();
               pw.close();
               socket.close();
               break;
            }
         } while (true);
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if (br != null && pw != null) {
               br.close();
               pw.close();
            }
         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }

   }
}
