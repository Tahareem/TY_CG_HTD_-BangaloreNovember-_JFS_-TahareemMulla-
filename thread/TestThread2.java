package com.capgemini.thread.createthread;

public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Thread2 t2=new Thread2();
		
		Thread t=new Thread(t2);
		t.start();
		System.out.println("main ends");
	}
}
