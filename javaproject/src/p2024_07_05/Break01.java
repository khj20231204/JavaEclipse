package p2024_07_05;

public class Break01 {

	public static void main(String[] args) {
		
		//무한루프 : for문
		//break : 반복문을 빠져 나오는 역할
		for(int i=1;;i++) {
			//if(i == 10) break;
			System.out.println(i+" 무한 출력");
			break;
		}
		
		int i=1;
		while(true) {
			System.out.println(i + "무한 출력");
			i++;
			break;
		}
		
		System.out.println("--------------");
		//5~10
		int count = 0;
		while(true) {
			int num = (int)(Math.random()*(6-1+1)+1);
			
			System.out.println("num:"+num);
			count++;
			if(num == 6) break;
		}
		System.out.println(count);
		
	}

}
