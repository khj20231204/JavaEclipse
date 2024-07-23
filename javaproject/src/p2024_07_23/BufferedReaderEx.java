package p2024_07_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input Data : ");
		
		String s = "";
		try {
			s = br.readLine();
			System.out.println();
			System.out.println("Output String : " + s);
		}catch(IOException io) {
			io.printStackTrace();
		}

		int gugu = Integer.parseInt(s);
		for(int i=1 ; i<10 ; i++) {
			System.out.println(i + "*" + gugu + "=" + (gugu*i));
		}
	}

}
