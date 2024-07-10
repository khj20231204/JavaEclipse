package p2024_07_10;

import javax.sound.midi.Soundbank;

public class MathEx {

	public static void main(String[] args) {
		
		//Math 클래스
		//Math 클래스 = 정적 필드 + 정적 메소드
		//Math m = new Math(); Math는 정적 메소드로만 제공. 객체를 생성하지 않는다
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.abs(-5)); //절대값
		System.out.println(Math.round(3.8)); //반올림
		System.out.println(Math.ceil(3.1)); //올림
		System.out.println(Math.floor(3.9)); //내림
		
		int a = 54;
		int b = 34;
		int c = 3;
		int d = 49;
		
		int max = Math.max(a,b);
		max = Math.max(max,c);
		max = Math.max(max,d);
		
		System.out.println("max:"+max);
		
		System.out.println(Math.pow(2, 3)); //결과는 double형. 제곱
		System.out.println(Math.sqrt(4)); //결과는 double형. 제곱근
		System.out.println((int)(Math.random()* (6-2+1)+1));
	}

}
