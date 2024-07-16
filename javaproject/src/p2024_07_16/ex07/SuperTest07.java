package p2024_07_16.ex07;

/*
생성자
1.생성자는 기본적으로 상속되지 않음
2.자식 클래스로 객체를 생성할 때 자식 클래스의 생성자(기본 생성자, 매개변수가 있는 생성자 모두)가 호출되면, 부모 클래스의 기본 생성자가 자동으로 호출
3.부모 클래스의 매개변수가 있는 생성자를 호출할때는 super()를 이용해서 호출할 수 있다.   
4.자식 클래스에서 super()를 사용할 때는 자식 클래스의 생성자 첫번째 라인에서 사용.(super()의 위치는 정해져 있음)   

자바 상속에서 부모 클래스에 기본 생성자가 없는 경우, 두 가지 상황이 발생합니다.

	1. 자식 클래스에 기본 생성자만 있는 경우:

    문제 없이 정상적으로 작동합니다.
    자식 클래스 생성 시, 컴파일러가 자동으로 부모 클래스의 기본 생성자를 호출합니다.
    즉, 명시적으로 코드를 작성하지 않아도 부모 클래스의 필드가 초기화됩니다.

	2. 자식 클래스에 매개변수 있는 생성자만 있는 경우:

    컴파일 오류가 발생합니다.
    자식 클래스 생성 시, 반드시 부모 클래스의 생성자를 명시적으로 호출해야 합니다.
    이는 super() 키워드를 사용하여 수행됩니다.
  
 해결 방안
 	해결 방법:

    부모 클래스에 명시적으로 기본 생성자를 추가합니다.
    자식 클래스 생성자에서 super() 키워드를 사용하여 부모 클래스의 특정 생성자를 호출합니다.

	주의 사항:

    부모 클래스에 생성자가 하나라도 존재하면, 자식 클래스에서 생성자를 만들 때 반드시 부모 클래스 생성자를 호출해야 합니다.
    명시적으로 호출하지 않으면 컴파일 오류가 발생합니다.
*/

class Point2D{					//부모 클래스
	protected int x = 10;
	protected int y = 20;
	/*
	public Point2D() {			//기본 생성자
		System.out.println("부모 클래스인 Point2D 생성자 호출");
	}*/
	
	public Point2D(int b) {			//기본 생성자
		System.out.println("부모 클래스인 Point2D 매개변수가 있는 생성자 호출");
	}
}

class Point3D extends Point2D{
	protected int z = 30;
	
	public Point3D() {
		super(23);
	}
	
	public Point3D(int a) {
		super(a);
	}
	public void print() {
		System.out.println(x+", "+y+", "+z);
	}
}

public class SuperTest07 {

	public static void main(String[] args) {
		
		Point3D pt = new Point3D();
		pt.print();
		
		Point3D pt2 = new Point3D(23);
		pt2.print();
	}

}
