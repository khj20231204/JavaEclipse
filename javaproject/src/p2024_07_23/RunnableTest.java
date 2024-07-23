package p2024_07_23;

public class RunnableTest implements Runnable {
	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest();
		Thread thread = new Thread(rt);
		
		thread.start();

		for(int i=1000 ; i<2000 ; i++)
			System.out.println(i);
	}
}
