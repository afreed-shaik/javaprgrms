package com.ojas;

class Example {
	static  synchronized void dispMessage(String msg) {
		try {
			System.out.println(msg);
			Thread.sleep(3000);
			System.out.println(msg);
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

class Tasks extends Thread {
	public void run() {
		Example.dispMessage("Afreed");
	}
}

class Tasks1 extends Thread {
	public void run() {
		Example.dispMessage("Afrid");
	}
}

class Tasks2 extends Thread {
	public void run() {
		Example.dispMessage("Afridi");
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tasks t = new Tasks();
		Tasks1 t1 = new Tasks1();
		Tasks2 t2 = new Tasks2();
		t.start();
		t1.start();
		t2.start();
	}

}
