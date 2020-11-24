package com.main;


public class Thread4Main extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("running child Thread in loop :" + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

	public static void main(String[] args) {
		Thread4Main thread = new Thread4Main();
		Thread thread1 = new Thread(thread);
		Thread thread2 = new Thread(thread);
		Thread thread3 = new Thread(thread);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
