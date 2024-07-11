package p2024_07_11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Calendar 클래스
		//java.util
		//Calendar cal = new Calendar(); //오류발생
		Calendar cal = new GregorianCalendar(); //업캐스팅 - 상속 관계, Calendar 부모, GregorianCalenar 자식
		
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2); // 현재 운영체제의 값을 가져온다. 1720680064400
		System.out.println(Calendar.YEAR); //1
		
		int y = cal2.get(Calendar.YEAR); //2024
		int m = cal2.get(Calendar.MONTH) + 1; //6 + 1, 월:0~11
		int d = cal2.get(Calendar.DATE); //11
		int h = cal2.get(Calendar.HOUR); //현재 시간(12시간제)
		int h2 = cal2.get(Calendar.HOUR_OF_DAY); //현재 시간(24시간제)
		
		int ap = cal2.get(Calendar.AM_PM); //0:오전, 1:오후
		String strDay = "";
		if(ap == 0) {
			System.out.println("오전");
			strDay = "오전";
			
		}else {
			System.out.println("오후");
			strDay = "오후";
		}
		
		int mm = cal2.get(Calendar.MINUTE); //현재 분
		int ss = cal2.get(Calendar.SECOND);
		
		System.out.println(y+"년 " + m+"월 " + d+"일 " + h+":"+ mm+ ":"+ss + " " + strDay);
		
		
	}

}
