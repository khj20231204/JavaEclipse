package p2024_07_23;

public class ThreadLife implements Runnable {
	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	
	public static void main(String[] args) {
		ThreadLife tl = new ThreadLife();
		
		Thread first = new Thread(tl, "first");
		Thread second = new Thread(tl, "second");
		Thread third = new Thread(tl, "third");
		
		first.start();
		second.start();
		third.start();
	}
}
