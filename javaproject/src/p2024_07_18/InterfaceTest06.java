package p2024_07_18;

interface IColor{
	int RED = 1;						//상수
	public static final int GREEN = 2;	//상수
	public static final int BLUE = 3;	//상수
	void setColor(int c);				//추상메소드 : public abstract 생략
	public abstract int getColor();		//추상메소드
}

abstract class AbsColor implements IColor{
	int color = GREEN;					//int color = 2(상속)
	
	public void setColor(int c) {		//메소드 오버라이딩
		color = c;
	}
}

class SubClass extends AbsColor{
	@Override
	public int getColor() {
		return color;
	}
}

public class InterfaceTest06 {

	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.setColor(IColor.GREEN);
		System.out.println(test.getColor());
	}
}
