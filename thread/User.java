package com.capgemini.thread.createthread;

public class User extends Thread{
	PVR p;

	public User(PVR p) {
		
		this.p = p;
	}
	
	@Override
	public void run() {
		p.confirmTicket();
	}
	

}
