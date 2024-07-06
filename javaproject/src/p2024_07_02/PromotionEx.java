package p2024_07_02;

//p96
public class PromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동 타입 변환: 작은 자료형 데이터를 큰 자료형 변수에 할당하는 경우
		byte byteValue = 10;
		int intValue = byteValue;			//  자동 형변환
		System.out.println("intValue="+ intValue);
		
		char charValue = '가';
		intValue = charValue;				//  자동 형변환
		System.out.println("가의 유니코드:"+ intValue); // 44032
		
		intValue = 50;
		long longValue = intValue;			//  자동 형변환
		System.out.println("longValue="+ longValue);
		
		longValue = 100;
		float floatValue = longValue;		//  자동 형변환
		System.out.println("floatValue="+ floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;	//  자동 형변환
		System.out.println("doubleValue="+ doubleValue);
	}

}
