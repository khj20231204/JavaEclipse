package p2024_07_11;


class MyDate2{
	private int year; //필드, 멤버 변수
	private int month;
	private int day;
	
	public MyDate2(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print() {
		System.out.println(year+"/"+month+"/"+day);
	}
}

public class ClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate2 d = new MyDate2(2024, 07, 11);
		
		d.setYear(2025);
		d.setMonth(12);
		d.setDay(25);
	}

}
