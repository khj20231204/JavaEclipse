package p2024_07_24;

import java.io.*;

public class Homework {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			
			FileWriter file = new FileWriter("test.txt");
			
			file.write(str);
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
