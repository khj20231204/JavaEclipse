package boardMy;

public class MyBoardVO {

	private int number;
	private String name;
	private String subject;
	private String passwd;
	private String content;
	
	public MyBoardVO() {
	}

	public MyBoardVO(int number, String name, String subject, String passwd, String content) {
		this.number = number;
		this.name = name;
		this.subject = subject;
		this.passwd = passwd;
		this.content = content;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getContent() {
		return content;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "MyBoardVO [number=" + number + ", name=" + name + ", subject=" + subject + ", passwd=" + passwd
				+ ", content=" + content + "]";
	}
}
