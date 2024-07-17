package p2024_07_17.ex14;

interface IHello {
	int a = 10;						//상수 : public static final이 생략되어 있음
	void sayHello(String name);
}

interface IGoodBye{
	void sayGoodBye(String name);
}

interface ITotal extends IHello, IGoodBye{
	void greeting(String name); 
	//상속 받은 인터페이스에선 메소드 오버라이딩을 할 수 없다. 인터페이스는 일반 메소드를 가질 수 없다
}

//인터페이스를 상속받는 구현 클래스에서 3개의 추상 메소드를 모두 메소드 오버라이딩해야 한다.
class SubClass implements IHello, IGoodBye, ITotal{

	@Override
	public void greeting(String name) {
		System.out.println(name + "greeting");
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name + "sayGoodbye");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name + "sayHello");
	}
}

public class InterfaceTest04 {

	public static void main(String[] args) {
		SubClass test = new SubClass();
		
		test.greeting("나");
		test.sayGoodBye("루");
		test.sayHello("토!");
		
		System.out.println(test.a);
		System.out.println(IHello.a);	//static이라서 인터페이스에서도 접근 가능
		//IHello.a = 20; 수정하면 error 발생
	}

}
