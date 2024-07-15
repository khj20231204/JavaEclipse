package p2024_07_15;

public class WrapperEx {

	public static void main(String[] args) {
		
		//int형 변수의 최대값과 최소값
		System.out.println("max="+Integer.MAX_VALUE);
		System.out.println("max="+Integer.MIN_VALUE);
		
		//String형을 int형으로 형변환 : "20" -> 20
		//parseInt안에는 아무 문자나 들어가는 것이 아니라 숫자로 변형이 가능한 문자만 가능
		int n = Integer.parseInt("20"); 
		System.out.println(n+10);  //30, n이 숫자기 때문에 산술연산 가능함
		
		//10진수를 2진수로 변환
		System.out.println("2진수:"+Integer.toBinaryString(10)); //1010
		
		//10진수를 8진수로 변환
		System.out.println("8진수:"+Integer.toOctalString(10)); //12
		
		//10진수를 16진수로 변환
		System.out.println("16진수:"+Integer.toHexString(10)); //a
	}

}
