package p2024_07_02;

//p90
public class FloatDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 실수값 저장
//		float var1 = 3.14;		// 에러발생
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f; // float: 소숫점 7자리 정밀도
		double var5 = 0.1234567890123456789; // double: 소숫점 15자리 정밀도
		
		System.out.println("var2="+ var2);
		System.out.println("var3="+ var3);
		System.out.println("var4="+ var4);
		System.out.println("var5="+ var5);
		
		// e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6="+ var6);
		System.out.println("var7="+ var7);
		System.out.println("var8="+ var8);
		
	}

}
