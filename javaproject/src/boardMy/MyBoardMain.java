package boardMy;

import java.util.Scanner;

public class MyBoardMain {

	public static void main(String[] args) {
		
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		
		MyBoardSVC mbs = new MyBoardSVC();
		
		do{
			System.out.println("1.게시판 글쓰기:");
			System.out.println("2.게시판 목록:");
			System.out.println("3.글 삭제:");
			System.out.println("4.종료:");
			
			String str = sc.nextLine();
			boolean checkNum = checkNum(str);
			
			if(checkNum) {
				
				switch(str) {
					case "1" : mbs.writeArticle();
						break;
					case "2" : mbs.listArticle();
						break;
					case "3" : mbs.deleteArticle();
						break;
					case "4" : check = false;
						break;
				}
			}else {
				System.out.println("1~4까지 숫자만 가능합니다.");
			}
		}while(check);
	}
	
	public static boolean checkNum(String s) {
		
		//길이체크 return 1
		if(s.length() > 1) {
			return false;
		}
		
		//숫자체크 return 2
		char c = s.charAt(0);
		if(c < 49 || c > 52) {
			return false;
		}
		
		return true;
	}

}
