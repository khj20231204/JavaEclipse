package p2024_07_10;

public class homework {

	public static void main(String[] args) {
		
		int[][] arr = new int[8][9];
		
		for(int i=2 ; i<10 ; i++) {
			for(int j=1 ; j<10 ; j++) {
				arr[i-2][j-1] = i*j;
			}
		}
		
		/*
		for(int j=0 ; j<9 ; j++) {
			for(int i=0 ; i<8 ; i++) {
				System.out.print((i+2)+"*"+(j+1)+"="+arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0 ; i<8 ; i++) {
			for(int j=0 ; j<9 ; j++) {
				System.out.print((i+2)+"*"+(j+1)+"="+arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		String[][] arr2 = new String[2][4];
		int count = 1;
		for(int i=0 ; i<2 ; i++) {
			for(int j=0 ; j<4 ; j++) {
				arr2[i][j] = "["+i+"]["+j+"]="+count++; 
			}
		}
		System.out.println();
		System.out.println();
		
		for(int i=0 ; i<2 ; i++) {
			for(int j=0 ; j<4 ; j++) {
				System.out.print(arr2[i][j]+"\t"); 
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int j=0 ; j<4 ; j++) {
			for(int i=0 ; i<2 ; i++) {
				System.out.print(arr2[i][j]+"\t"); 
			}
			System.out.println();
		}
	}
}

