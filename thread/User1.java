package com.capgemini.thread.createthread;

public class User1 extends Thread {
	IRCTC i;

	public User1(IRCTC i) {
		
		this.i = i;
	}
	
	@Override
	public void run() {
		
		i.confirmTicket();
	}
	
}
