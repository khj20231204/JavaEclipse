package p2024_07_11;

public class Called {

	public void check() {
		System.out.println("메소드 호출 성공,");
		
		Called c = new Called();
		c.check();
	}
}
