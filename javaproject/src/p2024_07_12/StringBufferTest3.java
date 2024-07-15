package p2024_07_12;

public class StringBufferTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1); //gemini is beautiful
		
		sb1.insert(10, "very "); //인덱스 10번 위치에 very문자를 삽입 시킨다.
		System.out.println(sb1); //gemini is very beautiful
		
		sb1.insert(0, 1004 +" ");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("abcde");
		System.out.println(sb2); //abcde
		
		sb2.deleteCharAt(3);
		System.out.println(sb2); //abce
		
		sb2.delete(2, 3);
		System.out.println(sb2); //abe
	}

}
