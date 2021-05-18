package com.ojas;

public class Demo {

	
	int width;
    int height;
    int length;
    
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
		
		
//		Demo obj;
////		Demo obj1 = new Demo();
////        Demo obj2 = new Demo();
////        obj1.height = 1;
////        obj1.length = 2;
////        obj1.width = 1;
////        obj2 = obj1;
//        System.out.println(obj);
	}

}
