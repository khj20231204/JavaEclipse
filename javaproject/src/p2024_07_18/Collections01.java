package p2024_07_18;

import java.util.*;

public class Collections01 {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		set.add(2);
		set.add("하나");
		set.add(3.14);
		set.add(6);
		set.add("five");
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
