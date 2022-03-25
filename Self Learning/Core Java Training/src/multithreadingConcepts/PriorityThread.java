package multithreadingConcepts;

public class PriorityThread extends Thread {
	public void run() {
		System.out.println("Active Thread name = " + Thread.currentThread().getName());
		System.out.println("Active Thread Priority = " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		PriorityThread p1 = new PriorityThread();
		PriorityThread p2 = new PriorityThread();
		p1.setPriority(Thread.MIN_PRIORITY); //min=1
		p2.setPriority(Thread.MAX_PRIORITY); //max=10
		p1.start();
		p2.start();
	}
}
