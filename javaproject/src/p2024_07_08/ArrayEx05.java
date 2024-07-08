package p2024_07_08;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[] scores = {34, 46, 93, 78};
		
		int sum = 0;
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		
		int sum2 = 0;
		for(int i : scores) {
			sum2 += i;
		}
	}
}

