package com.ojas;

public class Test4 extends Thread {
	public void run() {
		for(int i = 0;i < 10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t1 = new Test4();
		t1.setName("First Thread");
		Test4 t2 = new Test4();
		t2.setName("Second Thread");
		Test4 t3 = new Test4();
		t3.setName("Third Thread");
		t1.start();
		try {
			t1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
