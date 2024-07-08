package p2024_07_08;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램   
		
		double[] data = {9.5, 7.0, 12.6, 10.5};
		
		double max, min;
		
		
		max = data[0];
		min = data[0];
		
		for(int i=1 ; i<data.length ; i++) {
			max = max > data[i] ? max : data[i];
			min = min < data[i] ? min : data[i];
		}

		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
}

