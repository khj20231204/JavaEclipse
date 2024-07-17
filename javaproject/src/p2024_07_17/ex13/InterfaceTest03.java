package p2024_07_17.ex13;

interface IHello {
	void sayHello(String name);
}

abstract class GoodBye {
	public abstract void sayGoodBye(String anme);
}

class SubClass extends GoodBye implements IHello{

	@Override
	public void sayHello(String name) {
		System.out.println("어이 " + name + " 앗농");
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println("어이 " + name + " 잘가");
	}
}

public class InterfaceTest03 {

	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.sayHello("ggoku");
		test.sayGoodBye("nenechikin");
	}

}
