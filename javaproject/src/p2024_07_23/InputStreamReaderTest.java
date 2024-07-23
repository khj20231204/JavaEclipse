package p2024_07_23;

import java.io.*;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		InputStreamReader isr2 = new InputStreamReader(System.in);
		
		System.out.println("데이터 입력 :");
		int inputValue = 0;
		
		try {
			inputValue = isr.read();
		}catch(IOException io) {
			System.out.println(io.getMessage());
		}
		
		System.out.println("unicode:"+inputValue);
		System.out.println("char:"+(char)inputValue);
	}

}
