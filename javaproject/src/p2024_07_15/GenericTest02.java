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
		System.out.println("돌려 받은값:"+obj01.getValue()); 
		
		int n = ((Integer)obj01.getValue()).intValue();	//다운캐스팅 + 언박싱
		//int n2 = ((int)obj01.getValue());	//다운캐스팅 + 언박싱
		
		Object obj02 = obj01.getValue();  
		System.out.println(obj02);
		
		//Object value = new Double(3.14); 	//업캐스팅 + 박싱
		//Object value = 3.14; 		//업캐스팅 + 자동박싱
		obj01.setValue(3.14);	//업캐스팅 + 박싱
		System.out.println("돌려 받은값:"+obj01.getValue()); 
		
		double d  = ((Double)obj01.getValue()).doubleValue();
		System.out.println("돌려 받은값:" + d);
		
		//Object value = new String("이해할 수 있다"); //업캐스팅 + 박싱
		obj01.setValue("이해할 수 있다");
		System.out.println("돌려 받은값:"+obj01.getValue()); 
		
		//다운 캐스팅
		String str = (String)obj01.getValue();
	}

}
