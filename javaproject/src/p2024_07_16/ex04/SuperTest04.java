package p2024_07_16.ex04;

class Point2D{					//부모 클래스
	protected int x = 10;		//은닉 변수 or 쉐도우 변수
	protected int y = 20;
}

class Point3D extends Point2D{	//자식 클래스
	protected int x = 50;
	protected int y = 70;
	
	protected int z = 80;

	public void print() {
		System.out.println(x+", "+y+", "+z);
		System.out.println(super.x+", "+super.y); //부모 클래스의 은닉 변수에 접근하는 방법. super
	}
	
	//super : 부모 클래스를 의미하는 레퍼런스 변수
	//super.x는 부모 클래스의 은닉 필드를 접근할 때 사용
	//super.x는 자식 클래스의 메소드 안에서 사용할 수 있다.
	//System.out.println(super.x); error발생. 메소드 밖에서 사용했기 때문 
	
	int a = super.x; //메소드 밖이라도 변수에 받는 건 가능
}

public class SuperTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D pt = new Point3D();
		pt.print();
	}

}
