package p2024_07_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
	
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(8000);
			
			System.out.println("Client 연결 대기 중...");
			socket = serverSocket.accept();
			
			System.out.println("Client에 연결됨");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream()); 
			
			while(true) {
				String inputMsg = in.readLine();
				
				if(inputMsg.equals("quit")) break;
				
				System.out.println("From Client:" + inputMsg);
				System.err.println("전송하기>>>");
				
				String outputMsg = scanner.nextLine();
				out.println(outputMsg);
				out.flush();
				
				if(outputMsg.equals("quit")) break;
			}
			
		}catch(Exception e){
			System.out.println("error:"+e);
		}finally {
			try {
				scanner.close();
				socket.close();
				serverSocket.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}

}
