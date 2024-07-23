package p2024_07_23;

import java.io.*;

public class BufferedReaderTest {

	public static void main(String[] args) {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Input Data : ");
		
		try {
			String s = br.readLine();
			System.out.println();
			System.out.println("Output String : " + s);
		}catch(IOException io) {
			io.printStackTrace();
		}
	}

}
