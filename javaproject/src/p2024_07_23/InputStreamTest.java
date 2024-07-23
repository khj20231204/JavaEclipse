package p2024_07_23;

import java.io.*;
import java.util.Scanner;

public class InputStreamTest {

	public static void main(String[] args) {
		//InputStream : 1byte 데이터를 입력 받을 수 있는 입력 스트림
		//System.in은 표준입력 장치인 키보드로 입력 받는다는 의미
		InputStream is = System.in;
		
		int inputValue = 0;
		
		System.out.print("데이터 입력 : ");
		
		try {
			inputValue = is.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력한 데이터 :" + inputValue);
		System.out.println("입력한 문자 :" + (char)inputValue);
	}
}
