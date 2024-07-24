package p2024_07_24;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("read.txt");
			FileWriter fw = new FileWriter("c:\\khj\\output.txt");
			
			int input = 0;
			while((input = fr.read()) != -1) {
				System.out.print((char)input);
				fw.write((char)input);
			}
			
			fr.close();
			fw.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
