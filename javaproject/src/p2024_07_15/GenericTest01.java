package p2024_07_15;

class TestClass{
	private int member;
	
	public void setValue(int value) {
		member = value;
	}
	
	public int getValue() {
		return member;
	}
}

public class GenericTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj01 = new TestClass();
		obj01.setValue(3);
		System.out.println("돌려 받은 값:"+obj01.getValue());
		
		//obj01.setValue(3.14);
		
		//obj01.setValue("3.14");
	}

}
