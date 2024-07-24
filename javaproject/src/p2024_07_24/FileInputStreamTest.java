package p2024_07_24;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) throws FileNotFoundException {
		int inputValue = 0;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("read.txt");
			//fis = new FileInputStream("C:\\Users\\user\\git\\JavaEclipse\\javaproject\\read.txt"); //절대경로
			//fis = new FileInputStream("C:/Users/user/git/JavaEclipse/javaproject/read.txt"); //절대경로
			
			while((inputValue = fis.read()) != -1) {
				System.out.print((char)inputValue);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//fis가 애초에 생성되지 않았으면 null이기 때문에 생성되지 않은 상태에선 close를 할 수 없다. 그렇기 때문에 null이 아닌 경우만 닫을 수 있다
				if(fis != null) fis.close(); 
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
