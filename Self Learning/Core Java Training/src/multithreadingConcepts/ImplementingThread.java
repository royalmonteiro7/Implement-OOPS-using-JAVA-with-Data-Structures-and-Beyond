package multithreadingConcepts;

public class ImplementingThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is activated");
	}

	public static void main(String[] args) {
		ImplementingThread i = new ImplementingThread();
		Thread t = new Thread(i);
		t.start();
	}

}
