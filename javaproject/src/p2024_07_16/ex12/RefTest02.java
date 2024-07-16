package p2024_07_16.ex12;

class Parent{				//부모 클래스
	
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : parentPrn메소드");
	}
}

class Child extends Parent{	//자식 클래스
	
	public void childPrn() {
		System.out.println("서브 클래스 : childPrn메소드");
	}
}

public class RefTest02 {

	public static void main(String[] args) {

		Parent p = new Child(); //업캐스팅
		p.parentPrn();			//상속해준 메소드만 호출 가능
		//p.childPrn();  		//error발생
		
		Child c;
		c = (Child)p;			//다운 캐스팅(강제 형변환)
		
		Child c1 = (Child)p;	//다운 캐스팅(강제 형변환)
		
		//다운 캐스팅이 되면 참조 가능한 영역이 확대
		c.parentPrn();
		c.childPrn();
		
		
	}

}
