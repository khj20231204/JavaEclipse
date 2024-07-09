package p2024_07_09;

class Car2{
	//this() : 같은 클래스의 생성자를 호출하는 역할

	//필드 
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car2() {
	}

	public Car2(String model) {
		this(model, "은색", 250); //같은 클래스 안에 생성자 호출
	}
	
	public Car2(String model, String color) {
		this(model, color, 250);
	}

	public Car2(String model, String color, int maxSpeed) {
		//this(model, color, maxSpeed);
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class CarEx2 {

	public static void main(String[] args) {
		Car2 Car2 = new Car2();
		System.out.println("Car2.company:"+ Car2.company);
		System.out.println("Car2.mode:"+ Car2.model);
		System.out.println("Car2.color:"+ Car2.color);
		System.out.println("Car2.maxSpeed:"+ Car2.maxSpeed);
		
		System.out.println();
		
		Car2 car2 = new Car2("자가용");
		System.out.println("car2.company:"+ car2.company);
		System.out.println("car2.mode:"+ car2.model);
		
		System.out.println();
		
		Car2 car3 = new Car2("자가용", "빨강");
		System.out.println("car3.company:"+ car3.company);
		System.out.println("car3.mode:"+ car3.model);
		System.out.println("car3.color:"+ car3.color);
		
		System.out.println();
		
		Car2 car4 = new Car2("자가용", "검정", 200);
		System.out.println("car4.company:"+ car4.company);
		System.out.println("car4.mode:"+ car4.model);
		System.out.println("car4.color:"+ car4.color);
		System.out.println("car4.maxSpeed:"+ car4.maxSpeed);
	}

}
