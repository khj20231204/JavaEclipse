package p2024_07_23;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		PrintWriter out = null;
		
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			socket = new Socket("127.0.0.1", 8000);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				System.out.println("전송하기>>>");
				String outputMsg = scanner.nextLine();
				out.println(outputMsg);
				out.flush();
				
				if(outputMsg.equals("quit")) break;
				
				String inputMsg = in.readLine();
				System.out.println("From Server:" + inputMsg);
				if(inputMsg.equals("quit")) break;
			}
			
		}finally {
			scanner.close();
			if(socket != null) socket.close();
			System.out.println("서버 연결 종료");
		}
	}

}
