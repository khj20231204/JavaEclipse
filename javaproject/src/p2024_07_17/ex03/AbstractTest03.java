package p2024_07_17.ex03;

abstract class AbstractClass{				//추상 클래스
	abstract void Method01();				//추상 메소드
	void Method02() {						//일반 메소드
		System.out.println("Method02 : 추상 클래스에서 구현"); 
	}
}

abstract class MiddleClass extends AbstractClass{	//추상 클래스가 추상 클래스를 상속받을 때도 extends
	public void Method03() {
		System.out.println("Method03 : 미들 클래스에서 구현");
	}
}

class SubClass extends MiddleClass{
	@Override
	void Method01() {
		System.out.println("Method01 : 자식 클래스에서 메소드 오버라이딩한 메소드");
	}
}

public class AbstractTest03 {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.Method01();		//메소드 오버라이딩된 메소드가 호출된다.
		obj.Method02();		//상속받은 Method02()메소드를 호출
		obj.Method03();		//상속받은 Method03()메소드를 호출
	}

}
