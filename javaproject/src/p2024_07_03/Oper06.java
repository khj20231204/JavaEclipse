package p2024_07_03;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min;
		System.out.println("정수 2개를 입력 하세요?");
		
		Scanner sc= new Scanner(System.in);
		
		int n1 = sc.nextInt();  // 스페이스바 or 엔터키로 구분함
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		System.out.println("max="+ max);
		System.out.println("min="+ min);
	}

}
