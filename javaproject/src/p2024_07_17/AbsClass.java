package p2024_07_17;

public abstract class AbsClass {		//추상 클래스
	
	int a = 10;				//필드 사용가능
	
	void check() {			//일반 메소드 사용가능
		System.out.println("일반 메소드");
	}
	
	abstract void check2();	//추상 메소드
}
