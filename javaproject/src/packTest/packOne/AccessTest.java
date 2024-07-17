package packTest.packOne;

public class AccessTest { //부모 클래스

	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;

	public void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
