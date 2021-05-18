package com.ojas;


class Task1 extends Thread {
	public void run() {
		System.out.println("Phani Task");
	}
}

class Task2 extends Thread {
	public void run() {
		System.out.println("Jyothi Task");
	}
}

class Task3 extends Thread {
	public void run() {
		System.out.println("Kalyan Task");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
