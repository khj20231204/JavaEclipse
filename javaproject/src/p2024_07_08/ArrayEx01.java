package p2024_07_08;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 : 동일한 자료형의 데이터를 저장하기 위한 정적이 자료구조
		//변수 -> 배열 -> 자료구조(List)
		
		//1차원 배열 첫번째 형식   
		//배열에 저장된 값이 정해져 있지 않는 경우에 주로 사용하는 형식
		
		int[] score = new int[3];
		//자료형 변수명 = 연산자 자료형[배열의 크기]
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		score[0] = 80;
		score[1] = 90;
		score[2] = 100;
		
		String[] str = new String[3];
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		System.out.println();
		
		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스프링";
		
		//1차원 배열 두번째 형식
		//배열 선언과 동시에 초기화를 할 때 주로 사용되는 형식
		//배열에 할당될 값이 정해져 있는 경우에 주로 사용
		
		int[] s = {80, 90, 100};
		int[] s1 = new int[] {80, 90, 100};
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println();
				
		for(int i=0 ; i<s.length ; i++) {
			System.out.print(s[i]+ "\t");
		}
		
		System.out.println();
		
		double[] dd = {2.34, 10.34, 13};
		for(int i=0 ; i<dd.length ; i++) {
			System.out.print(dd[i]);
		}
	}

}
