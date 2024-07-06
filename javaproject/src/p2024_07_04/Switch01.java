package p2024_07_04;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch case문
		// 키보드로 입력한 점수가 어느 학점에 해당 되는지 판변하는 프로그램을
		// 작성 하세요?
		
		// 90점 이상  - A학점
		// 80 ~ 89점 - B학점
		// 70 ~ 79점 - C학점
		// 60 ~ 69점 - D학점
		// 60점 미만 - F학점
		
		System.out.println("0~100점 사이의 점수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();	// s = 95
		s = s / 10;				// s /= 10
		
		switch(s) {
			case 10:
			case 9: System.out.println("A학점");
					 break;		// switch case문을 빠져 나가도록 해준다.
			case 8: System.out.println("B학점");
					 break;
			case 7: System.out.println("C학점");
					 break;
			case 6: System.out.println("D학점");
					 break;
		    default : System.out.println("F학점"); 
		}

	}

}
