package com.saimplilearn.concurrency;

public class MyClass {

	private static Object student1 = new Student(1,"Rajesh");

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(1000);

		System.out.println("Thread " + Thread.currentThread().getName() + " is woke up after 1 s of sleep");

		synchronized (student1) {

			student1.wait(100);
			System.out.println("Object " + student1 + " is woken up after 2 s of wait");
		}
	}
}
