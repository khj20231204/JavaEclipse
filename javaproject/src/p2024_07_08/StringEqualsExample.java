package p2024_07_08;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new연산자를 사용하지 않으면 힙영역에 한번만 만든다. "김현진"이란 메모리 영역은 1개
		String strVar1 = "김현진";
		String strVar2 = "김현진";
		
		if(strVar1 == strVar2) { //주소값을 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(strVar1.equals(strVar2)) { //값을 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
		//new연산자를 이용해서 String객체를 생성하면, heap메모리상에 매번 새로운 공간을 할당 받음. 
		String strVar3 = new String("김현진");
		String strVar4 = new String("김현진");
		if(strVar3 == strVar4) { //주소값을 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(strVar3.equals(strVar4)) { //값을 비교
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
		
	}

}
