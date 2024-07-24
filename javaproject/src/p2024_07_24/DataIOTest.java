package p2024_07_24;

import java.io.*;

//DataInputStream, DataOutputStream
//기본 자료형값을 유지 하면서 데이터 입,출력을 처리해주는 클래스
public class DataIOTest {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBoolean(true);
			dos.writeChar('a');
			dos.writeInt(343);
			dos.writeDouble(23.435);
			dos.writeFloat(2.345f);
			dos.writeUTF("자바");
			
			FileInputStream fis = new FileInputStream("output.txt");
			DataInputStream dis = new DataInputStream(fis);
			//위에 입력한 순서에 맞춰서 출력을 해야함
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
