package p2024_07_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MemberInput{
	private String name;
	private int age;
	private String email;
	private String address;
	
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

public class homework {

	public static void main(String[] args) {
		
//		System.out.println("성명, 나이 , 이메일, 주소를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		List<MemberInput> list = new ArrayList<MemberInput>();
		
		do {
			System.out.println("성명, 나이 , 이메일, 주소를 입력하세요(공백으로 구분합니다)");
			String str = sc.nextLine();
			
			addMember(list, str);
			
			System.out.println("계속하려면 Y/멈추려면 N를 입력하세요");
			String s = sc.nextLine();
			
			if(s.equals("N") || s.equals("n")) break;
		}
		while(true);
		
		printMember(list);
	}
	
	public static void addMember(List<MemberInput> mi, String s) {
		String[] strArray = s.split(" ");
		
		MemberInput m = new MemberInput();
		m.setName(strArray[0]);
		int age = Integer.parseInt(strArray[1]);
		m.setAge(age);
		m.setEmail(strArray[2]);
		m.setAddress(strArray[3]);
		
		mi.add(m);
	}
	
	public static void printMember(List<MemberInput> mi) {
		
		for(MemberInput m : mi) {
			System.out.println("성명:"+m.getName()+"\t나이:"+m.getAge()+"\t이메일:"+m.getEmail()+"\t주소:"+m.getAddress());
		
		}
	}
}

