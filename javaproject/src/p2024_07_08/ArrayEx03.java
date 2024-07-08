package p2024_07_08;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = new int[3]; //heap영역 안에 저장공간 3개를 생성
		
		System.out.println("3과목 점수를 입력하시오:");
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; //초기화를 하지 않으면 
		
		for(int i=0 ; i<s.length ; i++) {
			s[i] = sc.nextInt();
			sum += s[i]; //여기서 오류 발생
		}
		
		double avg = sum/3.0;
		System.out.println("총점:"+sum);
		System.out.printf("평균:%.2f",avg);
	}

}

