package p2024_07_09;

public class homework {

	public static void main(String[] args) {
		int[][] score = 
			{ 	{45, 65, 97}, //0행
				{5,  97, 12}, //1행
                {33, 49,  9}, //2행
                {94, 66, 12}, //3행   
                {3,  34, 83}  //4행
             };
		 
		int[] student = new int[score.length];
		int[] subject = new int[score[0].length];
		
		for(int i=0 ; i<score.length ; i++) {
			for(int j=0 ; j<score[0].length ; j++) {
				student[i] += score[i][j];
			}
		}
		
		for(int i=0 ; i<student.length ; i++) {
			System.out.println(i+"학생의 총점:"+ student[i]);
		}
		
		System.out.println();
		
		for(int j=0 ; j<score[0].length ; j++) {
			for(int i=0 ; i<score.length ; i++) {
				subject[j] += score[i][j];
			}
		}
		
		String[] str = {"국어", "영어", "수학"};
		for(int i=0 ; i<subject.length ; i++) {
			System.out.println(str[i]+"의 총점:"+ subject[i]);
		}
	}

}
