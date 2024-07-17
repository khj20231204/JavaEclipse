package p2024_07_17.ex02;

abstract class Hello{			//추상 클래스
	public abstract void sayHello(String name);	//추상 메소드
}

abstract class Goodbye{		//추상 클래스
	public abstract void sayGoodbye(String name);	//추상 메소드
}

class SubClass extends Hello{

	@Override
	public void sayHello(String name) {
		System.out.println(name+ "님 안녕");
	}
}

public class AbstractTest02 {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.sayHello("kimHJ");
	}

}
