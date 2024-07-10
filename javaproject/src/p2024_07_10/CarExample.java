package p2024_07_10;

class Car{
	//필드
	int gas;

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		
		System.out.println("gas가 있습니다");
		return true;
	}

	//루프를 빠져나갈 땐 break; 메소드를 빠져나갈 땐 return;
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다..(gas잔량:"+gas+")");
				return; //run() 빠져 나가도록 해준다.
			}
		}
	}
}

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("출발 합니다.");
			mycar.run();
		}
		
		gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("가스가 남았습니다.");
		}else {
			System.err.println("가스 앵꼬");
		}
	}

}
