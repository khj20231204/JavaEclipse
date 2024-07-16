package p2024_07_16.ex03;

//부모 클래스에 있는 필드를 자식 클래스에서 재정의(동일한 이름의 변수)하면,
//자식 클래스에서 재정의한 필드만 사용 가능하다.
//자식 클래스에서 새로 정의한 x,y만 사용된다.
class Point2D{					//부모 클래스
	protected int x = 10;		//은닉 변수 or 쉐도우 변수
	protected int y = 20;
}

class Point3D extends Point2D{	//자식 클래스
	protected int x = 50;
	protected int y = 70;
	
	//자식 클래스에서 새로 정의한 x,y만 사용된다.
	public void print() {
		System.out.println(x+", "+y);
	}
}

public class SuperTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D pt = new Point3D();
		pt.print();
	}

}
