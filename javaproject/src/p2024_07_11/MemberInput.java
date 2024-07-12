package p2024_07_11;

import java.util.Scanner;

class MemberInfo{
	
	private String name;
	private int age;
	private String email;
	private String address;
	
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class MemberInput {

	public static void main(String[] args) {
		
		int MAX = 3;
		System.out.println("성명 / 나이 / 이메일 / 주소를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		
		MemberInfo[] mi = new MemberInfo[MAX];
		
		//문자열 입력
		String[] str = new String[MAX];
		for(int i=0 ; i<MAX ; i++ ) {
			str[i] = sc.nextLine();
		}
		
		//공백으로 잘라서 클래스에 입력
		for(int i=0 ; i<MAX ; i++) {
			String s = str[i];
			String[] info = s.split(" ");
			
			mi[i] = new MemberInfo(info[0], Integer.parseInt(info[1]), info[2], info[3]);
		}

		//출력
		for(int i=0 ; i<MAX ; i++) {
			System.out.print("성명:"+mi[i].getName()+ "\t나이:"+mi[i].getAge()+"\t이메일"+mi[i].getEmail()+"\t주소:"+mi[i].getAddress());
			System.out.println();
		}
	
		sc.close();

	}

}
