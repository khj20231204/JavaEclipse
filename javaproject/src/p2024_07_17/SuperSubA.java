package p2024_07_17;

import packTest.packOne.AccessTest;

class SubOne extends AccessTest{	//자식 클래스
	void subPrn() {
		//System.out.println(a);  private(x)
		//System.out.println(b);  default(x)
		System.out.println(c);	//protected(o)
		System.out.println(d);	//public(o)
	}
}

public class SuperSubA {

	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.print();
		
		//System.out.println(at.a);  private(x)
		//System.out.println(at.b);  default(x)
		//System.out.println(at.c);	protected(x)
		System.out.println(at.d);	//public(o)
	}

}
