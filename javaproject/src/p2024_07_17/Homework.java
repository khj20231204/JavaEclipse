package p2024_07_17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Homework {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0 ; i<6 ; i++) {
			
			int r = (int)(Math.random()*(1+45-1)+1);
			while(list.contains(r)) {
				r = (int)(Math.random()*(1+45-1)+1);
			}
			list.add(r);
		}
		
		list.sort(Comparator.naturalOrder());
		
		for(int i : list) {
			System.out.println(i);
		}
	}

}
