package p2024_07_18;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("년을 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("윤년입니다.");
					System.exit(1);
				}
				System.out.println("윤년이 아님");
				System.exit(1);
			}else {
				System.out.println("윤년입니다.");
			}
		}else {
			System.out.println("윤년이 아님");
			System.exit(1);
		}
		
	}
}
