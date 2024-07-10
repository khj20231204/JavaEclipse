package p2024_07_10;

class Calculator{
	
	public void poweron() {
		System.out.println("전원을 켭니다");
		return;
	}
	
	protected int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	protected double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator mycal = new Calculator();
		mycal.poweron();
		
		int result1 = mycal.plus(5, 6);
		System.out.println("result1 : "+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = mycal.divide(x, y);
		System.out.println("result2 : "+result2);
	}

}
