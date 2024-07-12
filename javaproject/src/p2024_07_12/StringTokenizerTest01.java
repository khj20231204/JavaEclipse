package p2024_07_12;

import java.util.StringTokenizer;

public class StringTokenizerTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//토큰(token) : 구분기호(#)로 분리된 문자
		StringTokenizer str = new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕","#");
		/*
		System.out.println(str.nextToken()); //이순신
		System.out.println(str.nextToken()); //을지문덕
		System.out.println(str.nextToken()); //강감찬
		System.out.println(str.nextToken()); //광개토대왕
		System.out.println(str.nextToken()); //error발생, 예외 발생
		*/
		
		//파싱된 문자(토큰)가 모두 몇 개인지 구해온다.
		System.out.println("파싱된 문자의 갯수:"+str.countTokens());
		
		//토큰이 있을 경우
		while(str.hasMoreTokens()) { //토큰이 있으면
			System.out.println(str.nextToken()); //토큰을 구해온다
		}
		
		
	}

}
