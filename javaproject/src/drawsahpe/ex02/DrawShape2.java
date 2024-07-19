package drawsahpe.ex02;

class Point{
	int x;
	int y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends Point{
	
	Point p;
	int r;
	
	public Circle(Point p) {
		super(p.x, p.y);
	}
	
	public Circle(Point p, int r) {
		super(p.x, p.y);
		this.p = p;
		this.r = r;
	}
	
	public Circle() {
		super(32,34);
	}
}

class Shape extends Point{
	Point[] p = new Point[3];
	
	public Shape(Point[] p){
		this.p = p;
	}
}

public class DrawShape2 {

	public static void main(String[] args) {

		
	}

}
