package p2024_07_12;

public class ReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//replace(oldChar, newChar); oldChar를 newChar로 치환
		
		String oldStr = "자바는 객체지향 언어 입니다.";
		String newStr = oldStr.replace("자바","Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
