package com.saimplilearn.concurrency;

public class MyrunnableThread implements Runnable {

	public int myCount = 0;

	@Override
	public void run() {

		while (myCount < 10) {
			try {
				System.out.println(Thread.currentThread().getName() + " " + ++myCount);
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyrunnableThread());
		Thread t2 = new Thread(new MyrunnableThread());

		t1.start();

		try {
			t1.join();
		} catch (Exception e) {

		}
		t2.start();
	}

}
