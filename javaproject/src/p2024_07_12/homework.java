package p2024_07_12;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		String jumin = "950101-1234567";
		
		//String jumin1 = "950101";
		//String jumin2 = "1234567";
		//키보드로 주민번호를 입력 받아서 남자인지 여자인지 판별하는 프로그램
		//단, 주민번호 앞자리 6자리, 뒷자리는 7자리 인지를 유효성 검사하기
		
		Scanner sc = new Scanner(System.in);
		
		try {
			//예외가 발생할 가능성이 있는 문자
			
			System.out.println("주민번호 앞자리를 입력 하세요");
			String jumin1 = sc.nextLine();
			
			System.out.println("주민번호 뒷자리를 입력 하세요");
			String jumin2 = sc.nextLine();
			
			String g = jumin2.substring(0,1);
			
			if(jumin1.equals("")) {
				System.out.println("주민번호 앞자리를 입력 하세요.");
			}else if(jumin1.length() != 6) {
				System.out.println("주민번호 앞자리 6자리를 입력 하세요");
			}else if(jumin2.equals("")) {
				System.out.println("주민번호 뒷자리를 입력하세요");
			}else if(jumin2.length() != 7) {
				System.out.println("주민번호 뒷자리 7자리를 입력 하세요");
			}else if(g.equals("1") || g.equals("3")) {
				System.out.println("남자 입니다.");
			}else if(g.equals("2") || g.equals("4")) {
				System.out.println("여자 입니다.");
			}else {
				System.out.println("똑바로 입력 하세요");
			}
			
			//주민 앞번호 계산
			int[] jumin1Int = new int[6];
			for(int i=0 ; i<jumin1.length() ; i++) {
				jumin1Int[i] = (jumin1.charAt(i)-'0') *(i+2);
			}
			
			//주민 뒷번호 계산
			int[] jumin2Int = new int[7];
			int temp = 8;
			for(int i=0 ; i<jumin2.length()-1 ; i++) {
				if(temp > 9) temp = 2;
				jumin2Int[i] = (jumin2.charAt(i)-'0')*(temp++);
			}
		
			int tot1 = 0;
			for(int i : jumin1Int) tot1 += i;
			
			int tot2 = 0;
			for(int i : jumin2Int) tot2 += i;
			
			int tot = tot1+tot2;
			
			int tot_mod = tot % 11; //나머지를 구한다
			
			if(tot_mod > 10) {
				tot_mod = tot_mod % 10;
			}
			
			int checkNum = 11 - tot_mod;
			int checkNumJumin = jumin2.charAt(6) - '0';
			
			if(checkNum == checkNumJumin) {
				System.out.println("옳바른 주민 번호입니다.");
			}else {
				System.out.println("틀린 주민 번호 입니다.");
			}
			
		}catch (Exception e) {
			//예외가 발생할 때 나타낼 메시지
			System.out.println("잘못된 정보입니다.");
		}
	}

}
