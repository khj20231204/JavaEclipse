package p2024_07_09;

public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[5][3];
		
		score[0][0] = 85; score[0][1] = 64; score[0][2] = 90; 
		score[1][0] = 90; score[1][1] = 32; score[1][2] = 80; 
		score[2][0] = 75; score[2][1] = 92; score[2][2] = 30; 
		score[3][0] = 30; score[3][1] = 100; score[3][2] = 10; 
		score[4][0] = 100; score[4][1] = 53; score[4][2] = 59; 
		
		for(int row=0 ; row<5 ; row++) { //행 학생 1~5
			for(int col=0 ; col<3 ; col++) {  //열 과목: 국어, 영어, 수학
				System.out.print(score[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
