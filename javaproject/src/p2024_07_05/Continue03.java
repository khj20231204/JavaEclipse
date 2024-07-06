package p2024_07_05;

public class Continue03 {

	public static void main(String[] args) {

		//continue문을 이용해서 1~100까지 정수 중에서 5의 배수만 출력
		
		for(int i=1 ; i<=100 ; i++) {
			if(i % 5 != 0) continue;
			System.out.println(i);
		}
	}

}
