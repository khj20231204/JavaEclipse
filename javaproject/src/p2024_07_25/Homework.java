package p2024_07_25;

import java.util.*;

public class Homework {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		while(set.size() < 6) {
			int a = (int)((Math.random()*45)+1);
			set.add(a);
		}
		
		System.out.println(set);
	}
}
