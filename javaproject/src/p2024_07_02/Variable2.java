package p2024_07_02;

// p77
public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 15;	// 지역변수: v1(main메소드 안에서만 사용가능)
		if(v1 > 10) {
			int v2;		// 지역변수: v2(if문 안에서만 사용가능)
			v2 = v1 - 10;
		}
		 
//		int v3 = v1 + v2 + 5;	// 오류발생	

	}

}
