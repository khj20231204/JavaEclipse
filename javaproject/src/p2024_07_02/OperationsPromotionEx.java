package p2024_07_02;

// p103
public class OperationsPromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);					// 30
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드="+ intValue2);	   // 유니코드=66
		System.out.println("출력문자="+ (char)intValue2); // 출력문자=B
		
		// int형과 int형을 산술연산을 수행하면 결과는 int으로 처리된다.		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);			// 2
		
		// int형과 double형을 산술연산을 수행하면 결과는 큰 자료형인 double으로 처리된다.
		int intValue5 = 10;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);		// 2.5
		
		int x = 1;
		int y = 2;
		double result = (double) x/y;
		System.out.println(result);         	// 0.5
		
	}

}



