package com.saimplilearn.concurrency;

public class Threading extends Thread{

	public void run() {
		System.out.println("My Thread started");
	}
	
	public static void main(String[] args) {
		Threading t1=new Threading();
		t1.start();
	}
	
}
