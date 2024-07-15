package p2024_07_15;

public class WrapperEx4 {

	public static void main(String[] args) {

		//Double d = new Double(); 에러발생, 기본 생성자가 제공하지 않음
		
		Double d1 = new Double(3.14);	//박싱(boxing)
		Double d11 = 3.14;				//자동 박싱(boxing), new연산자를 사용하지 않고 바로 값을 대입
		
		double n1 = d1.doubleValue();	//언박싱
		double n11 = d1;				//자동 언박싱
		
		//1.자료형 변환 : "42.195" -> 42.195
		Double d2 = new Double("42.195");	//박싱
		//Double d22 = "42.195"; 			//error 발생, 문자로 값이 들어간 경우 자동 박싱 안됨
		double n2 = d2.doubleValue();	//언박싱
		double n22 = d2;				//자동 언박싱
		
		//2자료형 변환 : "42.195" -> 42.195
		double num = Double.parseDouble("42.195");
		System.out.println(num);
	}

}
