package p2024_07_12;

public class IndexOfTest {

	public static void main(String[] args) {

		String message = "Java Programming Creates project many objects";
		
		int index1 = message.indexOf('p'); //25, 가장 먼저 나오는 'p'의 인덱스 값
		System.out.println(index1);
		
		int index2 = message.indexOf(112); //25, 가장 먼저 나오는 112(p)의 인덱스 값
		System.out.println(index2);
		
		int index3 = message.indexOf('p',26); //첫번째:찾고자 하는 문자, 인덱스 번호 13번 이후의 p 검색
		System.out.println(index3); //-1, 결과 값이 없는 경우 -1리턴
		
		int index4 = message.indexOf("va");
		System.out.println(index4);
		
		int index5 = message.indexOf("ma", 12);
		System.out.println(index5); 
	}

}
