package p2024_07_16.ex08;

class Point2D{				//부모 클래스
	protected int x = 10;
	protected int y = 20;
	
	
	public Point2D() {
		System.out.println("부모 클래스의 기본 생성자");
	}
	
	public Point2D(int x, int y) {
		System.out.println("부모 클래스의 매개변수 생성자");
		
		this.x = x;
		this.y = y;
	}
}

/*
super()
1. super()는 부모 클래스의 매개변수를 가진 생성자를 호출할 때 사용.
2. super()는 자식 클래스의 생성자 안에서 첫번째 라인에 사용 / super.은 자식 클래스의 메서드 안에서 사용
3. super()를 이용해서 부모 클래스의 매개변수를 가진 생성자를 호출하면, 더이상 부모 클래스의 기본 생성자를 호출해주지 않는다.
*/

class Point3D extends Point2D{	//자식 클래스
	protected int z = 30;
	
	public void print() {
		System.out.println(x + ", " + y + ", " + z);
	}
	
	public Point3D() {
		super(4,5);				//부모 클래스의 매개변수가 있는 생성자를 호출
		System.out.println("자식 클래스의 기본 생성자");
	}
}

public class SuperTest08 {

	public static void main(String[] args) {
		Point3D pt = new Point3D();
		pt.print();
	}

}
