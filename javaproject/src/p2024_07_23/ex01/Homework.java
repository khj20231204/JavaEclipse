package p2024_07_23.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

class ThreadSleep implements Runnable {
	@Override
	public void run() {
		while(true) {
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss"); 
			
			String strDate = sdf.format(new Date());
			System.out.println(strDate);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class Homework {

	public static void main(String[] args) {
	    
		ThreadSleep ts = new ThreadSleep();
		Thread first = new Thread(ts,"first");
		
		//first.start();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		String date2 = sdf.format(new Date());
		System.out.println(date2);
	}
}
