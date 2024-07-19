package p2024_07_19;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {

		Queue myQue = new LinkedList();
		LinkedList myQue2 = new LinkedList();
		
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		
		System.out.println(myQue.poll());
		System.out.println(myQue.poll());
		System.out.println(myQue.poll());
		System.out.println(myQue.poll()); //null리턴
		//큐(queue)가 비어있으면 null리턴
		
		while(myQue.peek() != null) {
			System.out.println(myQue.poll());
		}
	}

}
