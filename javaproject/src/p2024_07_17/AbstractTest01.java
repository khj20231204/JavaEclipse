package p2024_07_17;

abstract class AbstractClass{		//추상 클래스
	int a = 10;
	abstract void Method01();		//추상 메소드
	void Method02() {				//일반 메소드
		System.out.println("일반 메소드");
	}
}

//추상 클래스를 상속 받으면, 추상 클래스 안에 있는 추상 메소드를 자신의 구현 클래스에서 반드시 오버라이딩 해야 한다. 
class SubClass extends AbstractClass{

	@Override
	void Method01() {
		System.out.println("메소드 오버라이딩 된 메소드");
	}
}

public class AbstractTest01 {

	public static void main(String[] args) {
		//AbstractClass ac = new AbastractClass();  추상 클래스는 자체적으로 객체생성 못함
		
		SubClass obj = new SubClass();
		obj.Method01();	//메소드 오버라이딩 된 메소드가 호출
		obj.Method02();	//부모 클래스에서 상속받은 Method02가 호출
	}
}
