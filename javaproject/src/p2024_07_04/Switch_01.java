package p2024_07_04;

import java.util.Scanner;

public class Switch_01 {

	public static void main(String[] args) {
		
		//키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~100점 사이의 점수를 입력");
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		switch(s/10) {
//			case 10 : System.out.println("A학점");
//				break;
			case 10: case 9: System.out.println("A학점");
				break;
			case 8 : System.out.println("B학점");
				break;
			case 7 : System.out.println("C학점");
				break;
			case 6 : System.out.println("D학점");
				break;
			default : System.out.println("F학점");
		}
	}

}
