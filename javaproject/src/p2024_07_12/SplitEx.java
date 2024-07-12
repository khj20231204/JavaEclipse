package p2024_07_12;

public class SplitEx {

	public static void main(String[] args) {

		//String[] split("구분기호");
		//전체 문자에서 구분기호를 이용해서 문자를 파싱해서(자르다) 배열로 리턴해주는 메소드

		String jumin = "86120934-349834";
		String[] j = jumin.split("-");
		
		System.out.println(j[0]);
		System.out.println(j[1]);
		
		for(String s : j) {
			System.out.println(s);
		}
		
		String tel = "010-3456-1838";
		String[] t = tel.split("-");
		for(String s : t) {
			System.out.println(s);
		}
		
		String email = "kuku@gmail.com";
		String[] e = email.split("@");
		for(String s : e) {
			System.out.println(s);
		}
	}

}
