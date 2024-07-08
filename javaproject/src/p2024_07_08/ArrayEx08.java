package p2024_07_08;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx08 {
	
	public static void main(String[] args) {
		
		//배열 복사 : for문으로 배열 복사
		int[] oldArray = {87,45,92};
		int[] newArray = new int[5]; 
		
		for(int i=0 ; i<oldArray.length ; i++) {
			newArray[i] = oldArray[i]; //작은 크기 배열을 큰 크기 배열에 저장은 가능, 범위를 넘어서는 나머지 영역은 0으로 초기화 
			//oldArray[i] = newArray[i]; //큰 배열을 작은 배열에 저장하면 에러 발생 
		}
		
		for(int i : newArray) {
			System.out.print(i+"\t");
		}
	}
}

