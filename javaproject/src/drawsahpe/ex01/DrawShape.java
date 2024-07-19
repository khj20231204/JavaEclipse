package drawsahpe.ex01;

class Point{

	int x;
	int y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Circle extends Point{
	Point center;
	int r;
	
	public Circle() {
		this(new Point(0,0), 1);
	}
	
	public Circle(Point p, int r) {
		this.center = p;
		this.r = r;
	}
	
	void draw() {
		System.out.println("center x:"+center.x+" ,center y:"+center.y+" ,r:"+this.r);
	}
}

class Shape extends Point{
	Point[] points = new Point[3];
	
	public Shape(Point[] p) {
		points = p;
	}
	
	void draw() {
		for(Point p : points) {
			System.out.println("p.x:"+p.x+" ,p.y:"+p.y);
		}
	}
}

public class DrawShape {

	public static void main(String[] args) {
		
		Circle c0 = new Circle();
		c0.draw();
		
		Circle c = new Circle(new Point(100,20),6);
		c.draw();
		
		Point[] p = {
				new Point(4,5),
				new Point(6,7),
				new Point(12,43)
		};
		
		Shape shape = new Shape(p);
		shape.draw();
		
	}

}
