package p2024_07_18;

import java.util.*;

//TreeSet
//데이터를 오름차순으로 정렬해서 저장하고 출력하는 기능을 제공한다.
//			오름차순 정렬 				내림차순 정렬
//----------------------------------------------
//숫자 : 작은 숫자부터 큰 숫자로 정렬   큰 숫자부터 작은 숫자로 정렬
//ex) 1 2 3 4 					4 3 2 1
//문자 : 사전순 정렬					사전역순 정렬
//ex) ㄱ ㄴ ㄷ ㄹ / a b c d .. 	ㄹ ㄷ ㄴ ㄱ / d c b a


public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		//boolean add(Object e)
		if(ts.add("korea")) {
			System.out.println("첫번째 korea 추가 성공");
		}else {
			System.out.println("첫번째 korea 추가 실패");
		}
		
		if(ts.add("japan")) {
			System.out.println("두번째 japan 추가 성공");
		}else {
			System.out.println("두번째 japan 추가 실패");
		}
		
		if(ts.add("amerian")) {
			System.out.println("세번째 amerian 추가 성공");
		}else {
			System.out.println("세번째 amerian 추가 실패");
		}
		
		if(ts.add("korea")) {
			System.out.println("네번째 korea 추가 성공");
		}else {
			System.out.println("네번째 korea 추가 실패");
		}
	}
}
