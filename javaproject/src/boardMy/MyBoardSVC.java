package boardMy;

import java.util.*;

public class MyBoardSVC {
	MyBoardVO mbv;
	List<MyBoardVO> list = new ArrayList<>();
	
	public MyBoardSVC() {
		mbv = new MyBoardVO();
	}
	
	//글 입력
	public void writeArticle() {
		
		//number가져오기
		int number = 1;
		if(list.size()>0) {
			MyBoardVO m = list.get(list.size()-1);
			number = m.getNumber()+1;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("작성자 이름:");
		String name = sc.nextLine();
		System.out.println("제목:");
		String subject = sc.nextLine();
		System.out.println("패스워드:");
		String passwd = sc.nextLine();
		System.out.println("내용:");
		String content = sc.nextLine();
		
		MyBoardVO mbv = new MyBoardVO(number, name, subject, passwd, content);
		list.add(mbv);
	}
	
	//글 목록
	public void listArticle() {
		for(MyBoardVO m : list) {
			System.out.println(m.getName() + "\t" + m.getName() + "\t" + m.getSubject() + "\t" + m.getContent());
		}
	}
	
	//글 삭제
	public void deleteArticle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("작성자 이름:");
		String name = sc.nextLine();
		
		System.out.println("패스워드:");
		String passwd = sc.nextLine();
		
		boolean check = false;
		for(int i=0 ; i<list.size() ; i++) {
			
			MyBoardVO m = list.get(i);
			
			if(m.getName().equals(name) && m.getPasswd().equals(passwd)) {
				list.remove(i);
				check = true;
			}
		}
		
		if(check) {
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("일치하는 값이 없습니다.");
		}
	}
}
