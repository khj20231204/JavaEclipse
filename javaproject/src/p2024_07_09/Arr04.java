package p2024_07_09;

public class Arr04 {

	public static void main(String[] args) {
		
		//2차원 배열
		//행 : 학생번호(1~5번)
		//열 : 과목(국어, 영어, 수학)
		
		int[][] score = 
			{ 	{45, 65, 97}, //0행
				{5,  97, 12}, //1행
                {33, 49,  9}, //2행
                {94, 66, 12}, //3행   
                {3,  34, 83}  //4행
             };
		 
		 for(int i=0 ; i<3 ; i++) {
			 for(int j=0 ; j<5 ; j++) {
				 System.out.println(score[j][i]);
			 }
			 System.out.println();
		 }
		 
		 int[] subject = new int[3]; //과목별 총점
		 int[] student = new int[5]; //학생별 총점
		 
		 int tot = 0;
		 for(int i=0 ; i<score.length ; i++) {
			 for(int j=0 ; j<score[0].length ; j++) {
				 tot += score[i][j];
				 System.out.print("학생별 점수:"+score[i][j]+"\t");
			 }
			 System.out.println();
			 
			 student[i] = tot;
		 }
		 
		 for(int i=0 ; i<student.length ; i++) {
			 System.out.println("student["+i+"]:"+student[i]);
		 }
		 
		 System.out.println();
		 
		 tot = 0;
		 for(int i=0 ; i<score[0].length ; i++) {
			 for(int j=0 ; j<score.length ; j++) {
				 tot += score[j][i];
				 System.out.print("과목별 점수:"+score[j][i]+"\t");
			 }
			 subject[i] = tot;
			 System.out.println();
		 }
		 
		 for(int i=0 ; i<subject.length ; i++) {
			 System.out.println("subject["+i+"]:"+subject[i]);
		 }
		 
		 System.out.println("------------");
		 int[][] temp = {{1,2,3},{4,5,6}};
		 
		 for(int i=0 ; i<temp.length ; i++) {
			 for(int j=0 ; j<temp[0].length ; j++) {
				 System.out.print(temp[i][j]);
			 }
			 
		 }
		 System.out.println();
		 for(int j=0 ; j<temp[0].length ; j++) {
			 for(int i=0 ; i<temp.length ; i++) {
				 System.out.print(temp[i][j]);
			 }
			 System.out.println();
		 }
	}

}
