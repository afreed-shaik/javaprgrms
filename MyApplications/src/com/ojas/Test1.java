package com.ojas;

public class Test1 extends Thread {
	
	public void run() {
		System.out.println("Current Thread Name : " + Thread.currentThread().getName());
		System.out.println("Current Thread Priority : " + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
