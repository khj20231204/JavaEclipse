package p2024_07_12;

public class SplitEx1 {

	public static void main(String[] args) {

		//String[] split"구분 기호)"
		String text = "홍길동&이수홍, 박연수, 김자바-최명호";
				
		String[] name = text.split("&|,|-");
		System.out.println();
		
		for(String n : name) {
			System.out.print(n);
			System.out.print("\t");
		}
	}

}
