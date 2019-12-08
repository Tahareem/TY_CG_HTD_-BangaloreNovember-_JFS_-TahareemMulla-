package com.capgemini.thread.createthread;

public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("main ends");
		
	}
}
