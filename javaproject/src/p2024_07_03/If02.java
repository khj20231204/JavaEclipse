package p2024_07_03;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if else문
		// if(조건식){
		//     조건식이 참인경우에 실행될 문장;
		// }else{
		//     조건식이 거짓인경우에 실행될 문장;
		// }
		
		// 키보드로 입력한 정수가 짝수인지, 홀수인지 판별하는 프로그램을 작성하세요?
		
		System.out.println("정수를 입력 하세요?");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// n = 5
		
		if(n % 2 == 0) {	// 짝수
			 System.out.println(n+"은(는) 짝수");
		}else {				// 홀수
			System.out.println(n+"은(는) 홀수");
		}		
	}

}




