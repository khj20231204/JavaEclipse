package p2024_07_17.ex10;

interface IHello{					//인터페이스
	void sayHello(String name); 	//추상 메소드
}


//1.인터페이스를 상속 받을 때는 implements로 상속 받아야 한다.
//2.인터페이스를 상속 받으면, 부모 인터페이스 안에 추상 메소드를 자식 클래스에서 반드시 메소드 오버라이딩(재정의)을 해야한다.
class Hello implements IHello{
	@Override
	public void sayHello(String name) {			
		//public 생략시 더 좁은 범위의 default로 접근제한자가 되기 때문에 public생략 안됨 
		System.out.println("어이 "+name + "앗농!");
	}
}

public class InterfaceTest01 {

	public static void main(String[] args) {

		//인터페이스는 자체적으로 객체 생성을 할 수 없다.
		Hello obj = new Hello();
		obj.sayHello("gagamel");
	}

}
