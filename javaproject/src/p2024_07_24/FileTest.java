package p2024_07_24;

import java.io.*;

public class FileTest {
	//File 클래스
	//파일이나 디렉토리를 관리하는 클래스 : 폴더 생성, 폴더 삭제, 파일 삭제
	public static void main(String[] args) {
		File temp = new File("c:/java01","temp");
		File tempFile = new File("test");
		
		try {
			//1.mkdirs() : 디렉토리를 생성하고 true를 리턴
			System.out.println("create temp directory "+ temp.mkdirs());
			System.out.println("create tempFile directory "+ tempFile.mkdirs());
			
			//2.비어 있는 디렉토리 삭제 : 비어있는 디렉토리
			//tempFile.delete(); 	//test디렉토리가 삭제된다.
			
			//3.비어있지 않는 디렉토리 삭제(과제)
			File[] files = tempFile.listFiles();
			for(int i=0 ; i<files.length ; i++) {
				files[i].delete();
			}
			tempFile.delete();

			//4.부모 디렉토리 지우기
			temp.delete(); //자식 디렉토리만 지워진다.
			File parentFile = temp.getParentFile();
			parentFile.delete();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
