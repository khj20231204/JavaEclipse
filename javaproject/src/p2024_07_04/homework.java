package p2024_07_04;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 1;
		for(int i=num ; i>1 ; i--) {
			System.out.print(i);
			System.out.print("*");
			sum *= i;
		}
		System.out.print("1=");
		System.out.println(sum);

		sc.close();
	}

}
