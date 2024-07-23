package p2024_07_23;

import java.io.*;

public class InputStreamReaderTest2 {

	public static void main(String[] args) {
		System.out.println("문자를 입력하라");
		InputStreamReader isr = new InputStreamReader(System.in);
		int inputValue = 0;
		char[] temp = new char[10];
		
		try {
			inputValue = isr.read(temp);
		}catch(IOException io){
			io.printStackTrace();
		}
		
		System.out.println("InputValue:"+inputValue);
		
		for(int i=0 ; i<inputValue ; i++) {
			System.out.println(temp[i]);
		}
		
		System.out.println(new String(temp));
	}

}
