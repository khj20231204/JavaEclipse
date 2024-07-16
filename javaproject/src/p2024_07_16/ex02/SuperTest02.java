package p2024_07_16.ex02;

//부모 클래스의 필드는 자식 클래스로 상속된다.
class Point2D{					//부모 클래스
	protected int x = 10;
	protected int y = 20;
	
}

class Point3D extends Point2D{	//자식 클래스
	protected int z = 30;
	
	public void print() {
		System.out.println(x+", "+y+", "+z);
	}
}

public class SuperTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D pt = new Point3D();
		
		pt.print();
	}

}
