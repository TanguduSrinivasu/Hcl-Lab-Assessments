package com.main;

import java.util.Date;

public class Thread2Main extends Thread{

	public static void main(String[] args) throws InterruptedException {
		
		
					Thread thread = new Thread("t1");
			System.out.println("Initial thread is : " + thread.getName());
			thread.setName("Thread");
			System.out.println("After changing thread is : " + thread.getName());
			System.out.println(new Date());
			thread.start();
			System.out.println("The Thread is in sleep for 10 seconds");
			thread.sleep(10000);           /*If we try to remove the try catch block,we need to handle the Unhandled Exception type InterrruptedException */
			System.out.println(new Date());
		
	}

}
