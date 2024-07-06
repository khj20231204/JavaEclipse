package p2024_07_05;

import java.util.Scanner;

public class MethodEx01 {

	int a = 10; //멤버변수, 필드(field)
	//사용자 정의 메소드
	//사용자 정의 메소드는 프로그래머가 직접 호출해야 실행
	public static void check() { //정적 메소드 : static이 붙어있는 메소드
		System.out.println("메소드 호출 성공");
		return; //생략가능
	}
	
	static void check(int a) { //매개변수(parameter): int a
		System.out.println("전달된 값:"+a);
	}
	
	static void check(int a, double b) {
		double result = a + b;
		System.out.println("전달된 값의 합:"+result);
	}
	
	static void check(char c) {
		System.out.println("전달된 값:"+c);
	}
	
	static void check(boolean b) {
		System.out.println("boolean 전달된 값:"+b);
	}
	
	//주소값 전달에 의한 메소드 호출방식(Call by Reference방식)
	static void check(String s) {
		System.out.println("stirng 전달된 값:"+s);
	}
	
	static int check01() {
		System.out.println("리턴구문");
		return 50;
	}
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	
	//main() 메소드는 자바 가상머신(JVM, java.exec)으로만 호출된다.
	//main() 메소드는 프로그래머가 직접 호출 할 수 없다.
	public static void main(String[] args) {
		MethodEx01.check(); //check() 메소드 호출
		check(); //같은 클래스 안에 있는 정적메소드는 "클래스."을 생략해도 호출 가능
		check(30);
		check(10, 20.5);
		check('a');
		check(5!=3);
		check("우리나라 개판");
		check(new String("우리나라 개판"));
		
		check01(); //return문으로 돌려받은 값이 출력되지 않는다.
		int result = check01();
		System.out.println("돌려 받은 값1:" + result);
		System.out.println("돌려 받은 값1:" + check01());
		
		double result2 = check02(50, 3.14);
		System.out.println("돌려 받은 값1:"+result2);
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.nextInt();
		
	}
}
