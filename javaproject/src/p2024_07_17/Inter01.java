package p2024_07_17;

public interface Inter01 {		//인터페이스
	int a = 10;					//상수 : public abstract 생략
	void check();				//추상 메소드 : public abstract 생략
	
	//인터페이스는 일반 메소드를 가질 수 없다
	//void check01() {} 일반 메소드 : 에러발생 
}
