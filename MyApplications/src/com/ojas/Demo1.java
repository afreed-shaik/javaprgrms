package com.ojas;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread r = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Welcome" + Thread.currentThread().getName());
			}
			
		});
		r.setName("mythread");
		r.start();
	}

}
