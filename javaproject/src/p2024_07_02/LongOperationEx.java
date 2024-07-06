package p2024_07_02;

// p100
public class LongOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자료형이 다른 변수를 산술연산을 수행하면 가장 큰자료형으로 자동형변환이 된다.
		
		byte value1 = 10;		// 1Byte
		int value2 = 100;		// 4Byte
		long value3 = 1000L;	// 8Byte
		
		long result = value1 + value2 + value3;
		System.out.println(result);
	}

}
