package p2024_07_25;

import java.util.*;

public class Homework {

	public static void main(String[] args) {
		
		int gdc = 1; //최대공약수
		int max = 1; //임시 최대값
		int a = 60;
		int b = 24;
		
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		
		while(check) { //나눠서 떨어지는 같은 수가 값는 경우 false리턴
			
			int min = a>b ? b : a;
			int count = 0;
			
			for(int i=1 ; i<min ; i++) {
				if((a%i != 0) && (b%i != 0)) {
					count++;
					System.out.println(i);
					//sc.nextLine();
				}
			}
			
			if(count == 1) {
				gdc = gdc*a*b;
				check = false;
			}
			
			for(int i=1 ; i<min ;i++) {
				if((a%i==0) && (b%i==0)){
					if(max < i) max = i;
				}
			}
			System.out.println("max:"+max);
			gdc *= max;
			System.out.println("gdc:"+gdc);
			a = a/max;
			b = b/max;
			System.out.println("a:"+a+" ,b:"+b);
			
		}
		
		System.out.println(gdc);
	}
}
