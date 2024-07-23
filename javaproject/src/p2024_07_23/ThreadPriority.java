package p2024_07_23;

public class ThreadPriority implements Runnable {
	@Override
	public void run() {
		for(int i=0 ; i<1000 ; i++)
			System.out.println(Thread.currentThread().getName()+" : "+i);
		
	}
	public static void main(String[] args) {
		ThreadPriority tp = new ThreadPriority();

		Thread first = new Thread(tp,"first");
		Thread second = new Thread(tp, "second");
		Thread third = new Thread(tp, "third");
		
		System.out.println("first:"+ first.getPriority());
		System.out.println("second:"+ second.getPriority());
		System.out.println("third:"+ third.getPriority());
		/*
		third.setPriority(Thread.MAX_PRIORITY);
		second.setPriority(Thread.NORM_PRIORITY);
		first.setPriority(Thread.MIN_PRIORITY);
		*/
		first.start();
		second.start();
		third.start();
	}
}
