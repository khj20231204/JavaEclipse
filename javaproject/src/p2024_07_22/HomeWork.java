package p2024_07_22;

import java.util.*;

class MemeberInfo{
	
	private String name;
	private int age;
	private String email;
	private String address;
	
	public MemeberInfo(String name, int age, String email, String address) {
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

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<MemeberInfo> list = new ArrayList<>();
		
		while(true) {
			System.out.println("성명 나이 이메일 주소를 입력하세요(공백으로 자르기)");
			String info = sc.nextLine();
			
			String data[] = info.split(" ");
			
			MemeberInfo mi = new MemeberInfo(data[0], Integer.parseInt(data[1]), data[2], data[3]);
			list.add(mi);

			System.out.println("중지하고 싶으면 N를, 계속하려면 Y를 입력하세요.");
			String s = sc.nextLine();
			if(s.equals("n") || s.equals("N")) {
				break;
			}
		}
		
		for(MemeberInfo mi : list) {
			System.out.println("성명:"+mi.getName()+" ,나이:"+mi.getAge()+" ,이메일:"+mi.getEmail()+" ,주소:"+mi.getAddress());
		}
	}
}
