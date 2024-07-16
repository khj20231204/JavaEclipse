package p2024_07_16.ex06;

class Parent{
	public void parentPrn(){							//부모 클래스
		System.out.println("부모 클래스의 메소드는 상속된다");	//은닉 메소드
	}
}

class Child extends Parent{								//자식 클래스
	
	//super.parentPrn(); error발생. 자식 클래스 안의 메소드 안에서 사용해야 됨
	public Child() {
		super();
	}
	
	@Override //어노테이션-컴파일하는 과정에서 점검
	public void parentPrn() {							//메소드 오버라이딩
		super.parentPrn();
		System.out.println("자식클래스:메소드 오버라이딩된 메소드");
	}

	public void ChildPrn() {
		
		super.parentPrn();
		System.out.println("자식 클래스의 메소드는 부모가 사용할 수 없다.");
	}
}

public class SuperTest06 {

	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn(); //오버라이딩된 메소드 호출
		c.ChildPrn(); //자신의 메소드 호출
	}

}
