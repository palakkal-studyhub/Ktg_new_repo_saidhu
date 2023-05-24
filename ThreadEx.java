package com.ktg.threads;

public class ThreadEx implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		ThreadEx obj = new ThreadEx();

		Thread th = new Thread(obj);//thread schedular 
		th.start();// run
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread ");
		}
	}

}
