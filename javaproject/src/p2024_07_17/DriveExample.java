package p2024_07_17;

class Vehicle{								//부모 클래스
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Drive{		
	public void drive(Vehicle vehicle) {	//매개변수의 다형성
		vehicle.run();
	}
}

class Bus extends Vehicle{					//자식 클래스
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
}

class Taxi extends Vehicle{					//자식 클래스
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}
}

public class DriveExample {

	public static void main(String[] args) {
		Drive driver = new Drive();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개변수의 다형성		//업캐스팅(자동 형변환)
		driver.drive(bus);	//Vehicle vehicle = new Bus(); 업캐스팅
		driver.drive(taxi);	//Vehicle vehicle = new taxi(); 업캐스팅
	}
}
