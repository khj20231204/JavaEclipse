package p2024_07_12;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println(sb1);
		System.out.println("sb1.length():" + sb1.length()); //6
		System.out.println("sb1.capacity():" + sb1.capacity()); //22
		
		sb1.append(" A string buffer implements a mutable sequence of characters");
		System.out.println("sb1.length():" + sb1.length()); //65
		System.out.println("sb1.capacity():" + sb1.capacity()); //65
		System.out.println("sb1:"+sb1);
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println("sb2.length():"+sb2.length()); //0
		System.out.println("sb2.capacity():"+sb2.capacity()); //16
	}

}
