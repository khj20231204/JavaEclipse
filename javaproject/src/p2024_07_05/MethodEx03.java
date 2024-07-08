package p2024_07_05;

import java.util.Scanner;

public class MethodEx03 {

	//키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램
	static int max(int a, int b) {
		if(a>b) return a;
		return b;
	}
	
	public static void main(String[] args) {
		
		System.out.println("2개의 정수 입력:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int r = max(a,b);
		
		if(r == a) {
			System.out.println("최대값:"+a+" ,최소값:"+b);
		}else {
			System.out.println("최대값:"+b+" ,최소값:"+a);
		}
		
	}

}
