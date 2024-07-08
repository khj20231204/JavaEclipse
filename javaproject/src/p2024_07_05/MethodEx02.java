package p2024_07_05;

import java.util.Scanner;

public class MethodEx02 {

	//1 ~ n까지 합을 구하는 메소드
	static int sum(int n) {
		
		int count = 0, sum = 0;
		while(count <= n) {
			sum += count;
			count++;
		}
		
		return sum;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("n을 입려하시오:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(sum(n));
		
	}

}
