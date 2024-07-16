package p2024_07_16;

import java.util.Calendar;

public class Homework_07_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year + "/" + (month+1) + "/" + day);
		
		String s;
		if(ap == 1) {
			s = "PM";
		}else {
			s = "AM";
		}
		 
		System.out.println(hour + "시" + minute + "분" + second + "초 " + s);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		String[] weekString = {"일요일","월요일","화요일","수요일","목요일","금요일"};
		
		System.out.println(weekString[week-1]);
	}
}
