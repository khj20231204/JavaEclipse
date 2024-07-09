package p2024_07_09;

public class FieldInitValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldInitValue f = new FieldInitValue();
		System.out.println("byteField:"+f.byteField);
		System.out.println("shortField:"+f.shortField);
		System.out.println("intField:"+f.intField);
		System.out.println("longField:"+f.longField);
		System.out.println("floatField:"+f.floatField);
		System.out.println("doubleField:"+f.doubleField);
		System.out.println("charField:"+f.charField);
		System.out.println("booleanField:"+f.booleanField);
		System.out.println("arrField:"+f.arrField);
		System.out.println("stringField:"+f.stringField);	
	}
}

class FieldInitValue{
	
	//new연산자로 객체를 생성해 공간을 heap에 할당 받는 순간 초기화 됨
	
	//필드
	byte byteField; //0
	short shortField; //0
	int intField; //0
	long longField; //0
	
	float floatField; //0.0
	double doubleField; //0.0
	
	char charField; //공백으로 초기화
	boolean booleanField; //false로 초기화
	
	int[] arrField; //null 참조할 주소가 없다는 의미
	String stringField; //null
	
	
}