package p2024_07_22;

public class DivideZeroExceptionHandling2 {

	public static void main(String[] args) {
		int b = 20;
		int a = 0;
		int c  = 0;
		
		try {
			c = b / a;
		}catch(Exception e) {
			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
			System.out.println(e.toString());
			
			System.out.println("0으로 나눌 수 없음");
		}
	
	}

}
