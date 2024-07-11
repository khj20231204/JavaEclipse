package p2024_07_11;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 날짜, 시간 관련 클래스 : Date, Timestamp
		
		//1. Date(java.util)
		Date d = new Date();
		System.out.println(d);
		
		//연, 월, 일, 시, 분, 초, 요일로 날짜를 출력
		//운영체제에 따라서 Thu 또는 '목'이 출력
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 a HH:mm:ss E요일");
		//hh : 12시간제 시간
		
		String strDate = sdf.format(new Date());
		System.out.println(strDate);
		//또는
		System.out.println(sdf.format(d));
		
		//2. Timestamp
		//연, 월, 일, 시, 분, 초
		//Timestamp ts = new Timestamp(); //기본 생성자가 제공되지 않음
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//HH : 24시간제 시간
		
		System.out.println(sdf2.format(ts));
	}

}
