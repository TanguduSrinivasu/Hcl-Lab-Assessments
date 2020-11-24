package com.main;

import java.util.Date;

public class Thread1Main extends Thread{

	public static void main(String[] args) {
		
		
		try {
			Thread thread = new Thread("t1");
			System.out.println("Initial thread is : " + thread.getName());
			thread.setName("Thread");
			System.out.println("After changing thread is : " + thread.getName());
			System.out.println(new Date());
			thread.start();
			System.out.println("The Thread is in sleep for 10 seconds");
			thread.sleep(10000);
			System.out.println(new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
