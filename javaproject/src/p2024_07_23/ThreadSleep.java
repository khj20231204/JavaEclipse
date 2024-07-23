package p2024_07_23;

public class ThreadSleep implements Runnable {
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();
		
		Thread first = new Thread(ts,"first");
		Thread second = new Thread(ts,"second");
		
		first.start();
		second.start();
	}

}
