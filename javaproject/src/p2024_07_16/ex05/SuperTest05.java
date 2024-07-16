package p2024_07_16.ex05;

class Parent{
	
	public Parent(){
		System.out.println("부모 클래스 생성자");
	}
	
	public void parentPrn(){
		System.out.println("부모 클래스의 메소드는 상속된다");
	}
}

class Child extends Parent{
	public void ChildPrn() {
		System.out.println("자식 클래스의 메소드는 부모가 사용할 수 없다.");
	}
}

public class SuperTest05 {

	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();
		c.ChildPrn();
		
		Parent p = new Parent();
		p.parentPrn();
		//p.childPrn(); 자식 클래스의 메소드는 부모가 접근할 수 없다
	}
}
