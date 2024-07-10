package p2024_07_10;

class Computer{
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0 ; i<values.length ; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	//매개변수로 전달받은 값을 배열로 받아서 처리
	int sum2(int ...values) {
		int sum = 0;
		for(int i=0 ; i<values.length ; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}

public class ComputerExcample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer mycom = new Computer();
		int[] values1 = {1,2,3};
		
		int result1 = mycom.sum1(values1);
		System.out.println("result1:"+result1);
		
		int result2 = mycom.sum2(new int[] {1,2,3,4,5});
		System.out.println("result2:"+result2);
		
		int result3 = mycom.sum2(1,2,3,4,5);
		System.out.println("result3:"+result3);
	}

}


