package p2024_07_22;

public class DivideZeroException {

	public static void main(String[] args) {
		int b = 20;
		int a = 0;
		
		try{
			int c = b / a;	
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눠서 에러 발생");
		}
	}

}
