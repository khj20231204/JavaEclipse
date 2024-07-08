package p2024_07_03;

public class Oper10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 증감 연산자 : ++, --
		
		int a=10, b=10, c=10, d=10; 
		int a1, b1, c1, d1;
		
		a1 = ++a;	// 선행연산
		b1 = b++;	// 후행연산
		c1 = --c;	// 선행연산
		d1 = d--;	// 후행연산
		System.out.println("a1="+a1+"  a="+a);  // a1=11  a=11
		System.out.println("b1="+b1+"  b="+b);  // b1=10  b=11
		System.out.println("c1="+c1+"  c="+c);  // c1=9   c=9
		System.out.println("d1="+d1+"  d="+d);  // d1=10  d=9

	}

}



