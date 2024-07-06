package p2024_07_03;

// p162
public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생 공식
		// 난수 = (정수화)(Math.random() * (상한값-하한값+1) ) + 하한값;		
		
		// 난수 발생
		//		 		0.0 <= Math.random()  < 1.0
		// 주사위 번호      1        ~             6
		
		// Math클래스는 생성자를 제공하지 않기 때문에 new 연산자로 직접 객체를 생성할 수 없다.
		//Math m = new Math();
		System.out.println("E="+ Math.E);    // E:오일러 상수
		System.out.println("PI="+ Math.PI);  // PI:원주율
		System.out.println(Math.random());	 // 난수발생
		
		// 주사위 번호 뽑기: 1 ~ 6
		int num = (int) (Math.random() * 6) + 1;	// 1 ~ 6
		System.out.println("num="+ num);
		
		if(num == 1) {
			System.out.println("1번");
		}else if(num == 2) {
			System.out.println("2번");
		}else if(num == 3) {
			System.out.println("3번");
		}else if(num == 4) {
			System.out.println("4번");
		}else if(num == 5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");
		}
		
		System.out.println("1~45사이의 난수 발생");
		int r = (int)(Math.random() * 45) + 1;	// 1 ~ 45
		System.out.println("난수:"+ r);
	}

}



