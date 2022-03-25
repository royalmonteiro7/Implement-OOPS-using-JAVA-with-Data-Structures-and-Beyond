package multithreadingConcepts;

public class ExtendingThread extends Thread {
	public void run() {
		System.out.println("Thread is activated");
	}

	public static void main(String[] args) {
		ExtendingThread e1 = new ExtendingThread();
		e1.start();
	}
}
