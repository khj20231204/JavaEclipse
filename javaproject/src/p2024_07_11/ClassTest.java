package p2024_07_11;

class MyDate{
	
	private int year;  //필드
	private int month;
	private int day;
	
	// 생성자는 클래스로 객체를 생성할 때 호출되며, 필드값을 초기화 시키는 역할을 한다.
	public MyDate(){  //생성자
		year = 2024;
		month = 07;
		day = 11;
	}
	
	public MyDate(int year, int month, int day) { //매개변수가 있는 생성자
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void print() {
		System.out.println(year+"/"+month+"/"+day);
	}
}

public class ClassTest {

	public static void main(String[] args) {
		
		MyDate d = new MyDate();
		//생성자에서 초기화 하지 않으면 year=0, month=0, day=0으로 초기화
		
		//private  접근 제어자는 외부 클래스의 접근을 허용하지 않기 때문에 직접 접근 할 수 없다.
		d.print();
		
		MyDate d2 = new MyDate(2024,12,25);
		d2.print();
	}

}
