package p2024_07_24;

import java.io.*;

public class FilReaderTest {

	public static void main(String[] args) {
		int inputValue = 0;
		FileReader fr = null;
		
		try {
			fr = new FileReader("read.txt");
			
			while((inputValue = fr.read()) != -1) {
				System.out.print((char)inputValue);
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				if(fr != null) fr.close();
			}catch(Exception e) {
				
			}
		}
	}
}
