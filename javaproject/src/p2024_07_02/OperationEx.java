package p2024_07_02;

public class OperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue = charValue1 + charValue2; //아스키코드 'A'값에 1을 더한다
		System.out.println(intValue); //66
		
		//int형과 double형을 산술연산을 수행하면 결과는 큰 자료형이 double로 처리된다.
		int intValue2 = 10;
		
		double doubleValue = intValue2 / 4.0;
		System.out.println(doubleValue);
		
		doubleValue = intValue2 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double)x/y;
		System.out.println(result); //int형과 int형을 연산하면 결과는 int기 때문에 소수점이 없어진 0이 나온다.
		//앞에 bouble로 강제변환하면 0.5가 나온다

		//int형과 double형을 산술연산을 수행하면 더 큰 double형이 된다
	}

}
