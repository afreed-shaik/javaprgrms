package com.ojas;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 1;i <= 10;i++) {
					System.out.println(i);
					try {
						Thread.sleep(2000);
						System.out.println(i);
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			}
		});
		t1.start();
	}

}
