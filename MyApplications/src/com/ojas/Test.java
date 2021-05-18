package com.ojas;


class Reserve implements Runnable {
	int available = 1;
	int wanted;
	
	Reserve(int i) {
		wanted = i;
	}
	
	public void run() {
		bookSeat();
	}
	
	public synchronized void bookSeat() {
		System.out.println("Available Berths = " + available);
		if(available >= wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted + " Berth(s) reserved for " + name);
			try {
				Thread.sleep(1500);
				available = available - wanted;
			}
			catch (InterruptedException ie) {
				
			}
		}
		else {
			System.out.println("Sorry, no berth(s) are available");
		}
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reserve obj = new Reserve(1);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("First Person");
		t2.setName("Second Person");
		t1.start();
		t2.start();
	}

}
