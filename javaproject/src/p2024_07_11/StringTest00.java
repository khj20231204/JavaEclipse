package p2024_07_11;

public class StringTest00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("Java Programming"); //new 연산자 사용, heap에 공간을 명시적으로 생성
		String str2 = new String("Java Programming"); //new 연산자에 의해 서로 다른 공간 생성
		
		if(str1 == str2) { //주소비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소"); //"다른 주소" 출력
		}
		
		String str3 = "Java Programming"; //문자열이 같기 때문에 같은 주소 공간에 생성
		String str4 = "Java Programming";
		
		if(str3 == str3) { //주소비교
			System.out.println("같은 주소");  //"같은 주소" 출력
		}else {
			System.out.println("다른 주소");
		}
		
		if(str1.equals(str3)) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
	}

}
