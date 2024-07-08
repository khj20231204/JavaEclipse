package p2024_07_08;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		int[] scores; //여기는 주소를 할당 받지 못한 상태
		scores = new int[]{83, 90, 87}; //여기서는 주소값을 할당받은 상태. 주소값은 new연산자를 사용하던지 초기화를 할 때 사용됨
		
		//int[] scores = new int[4]; 힙 영역에 공간을 할당 받은 상태
		//int[] scores = {83, 90, 87}; 힙 영역에 공간을 할당 받은 상태
		
		int sum1 = 0;
		for(int i=0 ; i<3 ; i++) {
			sum1 += scores[i];
		}
		
		int sum2 = add(new int[] {83, 990, 87});
		System.out.println(sum2);
	}
	
	//매개변수 int[] scores는 현재 아무런 주소도 갖지 못하고 있는 상태. 현재는 value값
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0 ; i<3 ; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
}

