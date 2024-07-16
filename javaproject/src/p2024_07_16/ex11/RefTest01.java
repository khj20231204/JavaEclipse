package p2024_07_16.ex11;

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

public class RefTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.parentPrn();			//상속받은 메소드 호출
		c.childPrn();			//자신의 메소드 호출
		
		//업캐스팅(자동 형변환) 2줄
		Parent p;
		p = c;
		
		//업캐스팅(자동 형변환) 1줄
		Parent p1 = new Child();
		Parent p2 = (Parent) new Child(); //(Parent) 있어도 그만 없어도 그만.
		
		//업캐스팅이 되면 상속해준 메소드만 호출 가능, 참조 가능 영역 축소
		p.parentPrn();
		//p.childPrn();
	}

}
