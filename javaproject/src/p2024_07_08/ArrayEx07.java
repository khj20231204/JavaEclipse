package p2024_07_08;

import java.util.Scanner;

public class ArrayEx07 {

	//절대값을 구해주는 메소드
	static int abs(int data) {
		if(data < 0) {
			return data * (-1);
		}
		
		return data;
	}
	
	public static void main(String[] args) {

		//args[0] = "-10", args[1] = "-20"
		System.out.println("args[0]:"+args[0]);
		System.out.println("args[1]:"+args[1]);
		
		int num = Integer.parseInt(args[0]);
		System.out.println("절대값:"+abs(num));
		
	}
}

