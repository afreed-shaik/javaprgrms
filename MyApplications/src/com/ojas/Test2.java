package com.ojas;

public class Test2 extends Thread {
	public void run() {
		for(int i = 0;i < 10;i++) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		t.setPriority(10);
		t.start();
		for(int i =0;i < 10;i++) {
			System.out.println("MAin Thread");
		}
	}

}
