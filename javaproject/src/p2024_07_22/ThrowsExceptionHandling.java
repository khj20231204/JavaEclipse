package p2024_07_22;

public class ThrowsExceptionHandling {

	public static void main(String[] args) {
		ThrowsExceptionHandling te = new ThrowsExceptionHandling();
		
		try {
			
		}catch(ArithmeticException ae) {
			System.out.println("Exception이 발생:"+ae.toString());
		}
		
	}
}