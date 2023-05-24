package com.ktg.threads;

public class ThreadEx1 extends Thread {

	@Override
	public void run() {//running
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread");// 5 thread-0
		}//dead
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("ktg");
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		ThreadEx1 obj = new ThreadEx1();//new state
		obj.start();//runnable
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");// name,priority main,5 1-10
		}

	}

}
