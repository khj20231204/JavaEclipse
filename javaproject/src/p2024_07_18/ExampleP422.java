package p2024_07_18;

interface InterfaceA{
	public void methodA();
}

interface InterfaceB{
	public void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
	public void methodC();
}

class ImplemenationC implements InterfaceA, InterfaceB, InterfaceC{

	@Override
	public void methodC() {
		System.out.println("ImplemenationC - methodC");
	}

	@Override
	public void methodB() {
		System.out.println("ImplemenationC - methodB");
	}

	@Override
	public void methodA() {
		System.out.println("ImplemenationC - methodA");
	}
	
}

public class ExampleP422 {

	public static void main(String[] args) {
		ImplemenationC impl = new ImplemenationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
