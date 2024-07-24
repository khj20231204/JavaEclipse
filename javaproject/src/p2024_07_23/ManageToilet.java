package p2024_07_23;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

class Family extends Thread{
	Toilet toilet;
	String name;
	boolean key;
	
	public Family(String name, Toilet t) {
		this.name = name;
		toilet = t;
	}
	
	public void run() {
		toilet.openDoor(name, key);
	}
}

class Toilet{
	
	public synchronized void  openDoor(String name, boolean b) {
		if(b == false) {
			System.out.println(name);
			usingTime();
			System.out.println("아~ 시원해");
			System.out.println();
		}else {
			System.out.println("사용중");
		}
	}
	
	public void usingTime() {
		for(int i=0 ; i<1000000 ; i++) {
			if(i == 10000) System.out.println("끄으응");
		}
	}
}

public class ManageToilet {

	public static void main(String[] args) {
		
		Toilet t = new Toilet();
		
		Family father = new Family("아버지", t);
		Family mother = new Family("어머니", t);
		Family syster = new Family("누나", t);

		father.start();
		mother.start();
		syster.start();
	}
}
