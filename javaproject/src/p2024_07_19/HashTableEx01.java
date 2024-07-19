package p2024_07_19;

import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class HashTableEx01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("abcd","2323");
		map.put("홍길동","2323");
		map.put("김돌석","2323");

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();
			
			if(map.containsKey(id)) {
				String idCheck = map.get(id);
				if(pw.equals(idCheck)) {
					System.out.println("성공");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다");
				}
			}else {
				System.out.println("아이디가 틀렸습니다.");
			}
		}
	}

}
