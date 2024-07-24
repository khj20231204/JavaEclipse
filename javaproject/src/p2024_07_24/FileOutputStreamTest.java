package p2024_07_24;

import java.io.*;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try {
			
			FileOutputStream fos = new FileOutputStream("output.txt");
			FileInputStream fis = new FileInputStream("read.txt");
			
			int input = 0;
			while((input = fis.read()) != -1) {
				System.out.print((char)input);
				fos.write((char)input);
			}
			
			fos.close();
			fis.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
