package p2024_07_12;

public class FindBlankIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Java Programming Creates many objects";
		
		for(int i=0 ; i<message.length() ; i++) {
			if(message.charAt(i) == ' ') {
				System.out.println(i+" : 공백 입니다.");
			}
		}
	}

}
