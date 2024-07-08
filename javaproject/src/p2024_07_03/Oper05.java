package p2024_07_03;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// 조건 연산자
		// 변수 = (조건식) 값1 : 값2;
		// 조건식이 참이면 값1을 변수에 할당하고, 조건식이 거짓이면 값2를 변수에 할당한다.
		
		// 키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요?
		
		int n1, n2, max, min;
		System.out.println("정수 2개를 입력 하세요?");
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();			// 스페이스바 or 엔터키로 구분함
		n2 = sc.nextInt();
		
		max = (n1 > n2) ? n1 : n2;	// 최대값
		min = (n1 < n2) ? n1 : n2;	// 최소값
		
		System.out.println("max="+ max);
		System.out.println("min="+ min);
	}

}



