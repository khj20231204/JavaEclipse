package p2024_07_09;

class Korean{//1개의 클래스가 동작멎ㄱ으로 
	//field
	String nation = "대한민국";
	String name; 	//이름
	String ssn; 	//주민번호

	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	//생성자
	//생성자는 클래스로 객체를 생성할 때 호출되며, 필드값을 초기화 시키는 역할을 한다.
	/*
	public Korean(String n, String s) { //생성자 : 객체를 생성할 때 호출, 필드 초기화만 담당
		this.name = n;
		this.ssn = s;
	}*/
	
}

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("박자바","1111-0000");
		
	}

}
