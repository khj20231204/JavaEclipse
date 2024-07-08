package p2024_07_04;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 중첩 while문
		// while문을 이용해서 구구단(2~9)을 출력하는 프로그램을 작성하세요?
		
		int dan=2, i;				// 초기값
		while(dan <= 9) {			// 조건식: 단
			System.out.println("["+dan+"단]");
			
			i=1;			
			while(i <= 9) {			// 조건식
				System.out.println(dan+"*"+i+"="+dan*i);
				i++;				// 증감식
			}
			dan++;					// 증감식	
			System.out.println();   // 각단 줄간격 벌리기
		}
		
	}

}
