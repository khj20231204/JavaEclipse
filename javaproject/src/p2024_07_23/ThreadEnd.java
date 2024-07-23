package p2024_07_23;

public class ThreadEnd extends Thread{

	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		ThreadEnd te = new ThreadEnd();
		te.run();
		
		for(int i=2000 ; i<3000 ; i++)
			System.out.println(i);
	}
}
