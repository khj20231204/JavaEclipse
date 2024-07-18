package p2024_07_18;

import java.util.*;

class Board{
	
	String subject;
	String content;
	String write;
	
	public Board(String subject, String content, String write) {
		this.subject = subject;
		this.content = content;
		this.write = write;
	}
	
	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", write=" + write + "]";
	}
}

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "작가1"));
		list.add(new Board("제목2", "내용2", "작가2"));
		list.add(new Board("제목3", "내용3", "작가3"));
		list.add(new Board("제목4", "내용4", "작가4"));
		
		for(Board b : list) {
			System.out.println(b.toString());
		}
		
		list.remove(1);
		list.remove(1);
		
		System.out.println();
		
		for(Board b : list) {
			System.out.println(b.toString());
		}
	}

}
