package com.saimplilearn.concurrency;

public class Threading2 implements Runnable {

	public void run() {
		System.out.println("My Thread started using runnable");
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Threading2());
		t1.start();
	}

}
