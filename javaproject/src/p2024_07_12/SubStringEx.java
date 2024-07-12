package p2024_07_12;

public class SubStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "891113-1923455";
		char num1 = str.charAt(7);
		System.out.println(num1);
		
		if(num1 == '1'|| num1 == '3') {
			System.out.println("남자");
		}else if(num1 == '2' || num1 == '4'){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		
		
		String num2 = str.substring(7,8);
		System.out.println(num2);
		
		if(num2.equals("1") || num2.equals("3")) {
			System.out.println("남자");
		}else if(num2.equals("2") || num2.equals("4")){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		
		int num3 = Integer.parseInt(str.substring(7,8));
		System.out.println(num3);
		
		if(num3 == 1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}

}
