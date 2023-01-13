package com.deloitte.corejava;


public class MyThread  implements Runnable{

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
	for (int i = 1; i <=10; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i+" by "+ct.getName());
		
	}
		
	}
	
	public static void main(String[] args) {
		MyThread m1=new MyThread();
		MyThread m2= new MyThread();
		Thread t1 = new Thread(m1);
		t1.setName("Bahubali 1");
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority: "+t1.getPriority());
		
		
		Thread t2=new Thread(m2);
		t2.setName("Bahubali 2");
		t1.start();
		t2.start();
	}

}
