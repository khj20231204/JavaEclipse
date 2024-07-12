package p2024_07_12;

public class SubStringTest {

	public static void main(String[] args) {

		//substring : 전체 문자열에서 특정 볌위의 문자를 추출하는 메소드
		
		String message = "Java Programming creates many objects.";
		
		String str1 = message.substring(3); //인덱스 번호 3이후부터 끝까지 추출   
		System.out.println(str1);
		
		String str2 = message.substring(3, 6); //3부터 5까지 추출
		System.out.println(str2);
		
		
		
	}

}
