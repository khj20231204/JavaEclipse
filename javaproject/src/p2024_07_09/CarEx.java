package p2024_07_09;

class Car1{
	//필드 
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로딩 : 한개의 클래스 안에 생성자를 여러개 정의하는 것
	//생성자 오버로딩 조건 : 매개변수의 자료형, 갯수, 순서
	//기본 생성자는 컴파일러가 자동으로 생성해주지만, 예외적으로 매개변수를 가진 생성자가 있을 경우에는 더이상 기본 생성자를 자등으로 생성 해주지 않음
	public Car1() {
		//mode, color : null로 초기화
		//maxSpeed : 0으로 초기화
	}

	public Car1(String model) {
		this.model = model;
	}
	
	public Car1(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Car1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 car1 = new Car1();
		System.out.println("car1.company:"+ car1.company);
		System.out.println("car1.mode:"+ car1.model);
		System.out.println("car1.color:"+ car1.color);
		System.out.println("car1.maxSpeed:"+ car1.maxSpeed);
		
		System.out.println();
		
		Car1 car2 = new Car1("자가용");
		System.out.println("car2.company:"+ car2.company);
		System.out.println("car2.mode:"+ car2.model);
		
		System.out.println();
		
		Car1 car3 = new Car1("자가용", "빨강");
		System.out.println("car3.company:"+ car3.company);
		System.out.println("car3.mode:"+ car3.model);
		System.out.println("car3.color:"+ car3.color);
		
		System.out.println();
		
		Car1 car4 = new Car1("자가용", "검정", 200);
		System.out.println("car4.company:"+ car4.company);
		System.out.println("car4.mode:"+ car4.model);
		System.out.println("car4.color:"+ car4.color);
		System.out.println("car4.maxSpeed:"+ car4.maxSpeed);
	}

}
