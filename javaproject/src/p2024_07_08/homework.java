package p2024_07_08;

import java.util.Arrays;
import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		System.out.println("정수 5개를 입력하세요:");
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = Arrays.stream(num).max().getAsInt();
		int min = Arrays.stream(num).min().getAsInt();
		
		System.out.println("max:"+max +" ,min:"+min);
	}

}
