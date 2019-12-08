package com.capgemini.thread.createthread;

public class PvrUserTest {
	public static void main(String[] args) {
		System.out.println("main starts");
		PVR p1=new PVR();
		
		User u1=new User(p1);
		
		u1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		p1.leaveMe();
		System.out.println("main ends");
	}
}
