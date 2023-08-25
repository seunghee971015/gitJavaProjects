package com.kh.TCP_Test;
import java.net.*;
import java.io.*;

public class TCPChatServer {
   public static void main(String[] args){
        System.out.println("Server Start");
        int port = 5000;
        String serverIP = null;
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);
            serverIP = serverSocket.getInetAddress().getHostAddress();
            while (true) {
                System.out.println("대기중...");
               Socket clientSocket = serverSocket.accept();
               String clientIP = clientSocket.getInetAddress().getHostAddress();
               System.out.println(clientIP + "연결중...");

               BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
               PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());

               try {
                   String recievaMessage;
                   while (!((recievaMessage = br.readLine()).equals("exit"))){
                       System.out.println(clientIP + " : " + recievaMessage);
                       pw.println(serverIP + " : 수신 완료");
                       pw.flush();
                   }
                   pw.println(serverIP + " : 연결 종료");
                   pw.flush();
                   System.out.println(clientIP + " : 종료되었습니다.");
                   br.close();
                   pw.close();
                   clientSocket.close();
               } catch (SocketException e) {
                   System.out.println(clientIP + " : error 종료");
               }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
