package p2024_07_08;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {83, 90, 87};
		
		int sum = 0;
		for(int i= 0 ; i<score.length ; i++) {
			sum += score[i];
		}
		
		System.out.println("총점:"+sum);
		
		double avg = (double)sum / score.length;
		System.out.println("평균:"+avg);
		
		System.out.printf("%.2f", avg);
	}

}
