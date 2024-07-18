package p2024_07_15;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		//Integer num = new Integer(); Integer클래스는 기본생성자가 없음. error발생
		
		//박싱(boxing)
		//heap메모리를 박스로 생각하고, stack메모리에 저장된 10을 heap메모리에 복사 하는 것.(heap메모리 박스에 집어 넣는다)
		int n = 10; 					//지역변수 : stack영역에 저장
		Integer num01 = new Integer(n); //박싱(boxing)
		
		//언박싱(unboxing)
		//heap메모리에 있는 데이터를 stack메모리에 가져 오는 것
		int n01 = num01.intValue(); 	//언박싱(unboxing)
		
		//자료형 변환 : "20" -> 20
		String s = "20";
		Integer num02 = new Integer(s); //박싱
		int n02 = num02.intValue();		//언박싱
	}

}
