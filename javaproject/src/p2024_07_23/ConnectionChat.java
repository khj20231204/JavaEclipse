package p2024_07_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class Server implements Runnable{
	@Override
	public void run() {
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
	
	void makeServer(){
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

class Client implements Runnable{
	
	@Override
	public void run() {
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
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			scanner.close();
			if(socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("서버 연결 종료");
		}
	}
	
	void makeClient() throws UnknownHostException, IOException {
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

public class ConnectionChat {
	public static void main(String[] args) {
		
		Server server = new Server();
		Thread thread = new Thread(server, "server");
		
		Client client = new Client();
		Thread thread2 = new Thread(client, "client");
		
		thread.start();
		thread2.start();
	}

}
