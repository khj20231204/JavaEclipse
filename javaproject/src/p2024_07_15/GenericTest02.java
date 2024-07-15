package p2024_07_15;

class TestClass2{
	private Object member;
	
	public void setValue(Object value) {
		member = value;
	}
	
	public Object getValue() {
		return member;
	}
}

public class GenericTest02 {

	public static void main(String[] args) {
		
		TestClass2 obj01 = new TestClass2();
		
		//Object value = new Integer(3);	//업캐스팅 + 박싱(new연산자 사용, 명시적으로 공간을 할당)
		//Object value = 3;					//업캐스팅 + 자동박싱
		obj01.setValue(3);
		System.out.println(obj01.getValue());
		
		Object obj02 = obj01.getValue();
		System.out.println((int)obj02);
	}

}
