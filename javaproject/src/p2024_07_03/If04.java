package p2024_07_03;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if else if문
		
		// 키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램을 작성하세요?
		// 90점 이상  - A학점
		// 80 ~ 89점 - B학점
		// 70 ~ 79점 - C학점
		// 60 ~ 69점 - D학점
		// 60점 미만  - F학점
		
		System.out.println("0~100점 사이의 점수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();		// s=95
		
		//1. if else if문은 여러 조건식 중에서 가장먼저 만족하는 조건절 아랫쪽의 내용을 실행하고
		//   빠져 나온다.
		//2. 각 조건식들을 모두 만족하지 않을때는 else문 아랫쪽의 내용을 실행한다.
		if(s >= 90) {
			System.out.println("A학점");
		}else if(s >= 80) {
			System.out.println("B학점");
		}else if(s >= 70) {
			System.out.println("C학점");
		}else if(s >=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}	

	}

}
