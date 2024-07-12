package p2024_07_12;

import java.util.StringTokenizer;

public class StringTokenizerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자 매개변수 2가지 사용
		String source1 = "한국 미국 태국 중국 이란";
		StringTokenizer st1 = new StringTokenizer(source1, " ");
		
		System.out.println("문자열 갯수:"+st1.countTokens()); //문자열 갯수:5
		
		while(st1.hasMoreTokens()) {
			System.out.print(st1.nextToken()+"\t"); //한국	미국	태국	중국	이란	
		}
		
		System.out.println();
		System.out.println();
		
		String source2 = "푸들,삽살개,풍산개,진돗개,똥개";
		StringTokenizer st2 = new StringTokenizer(source2, ",");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println();
		
		//생성자 매개변수 3가지 사용
		//true : 구분기호(,)도 토큰에 포함해서 처리
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

}
