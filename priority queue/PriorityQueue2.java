package com.capg.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2 {

public static void main(String[] args)
{
	Queue p1=new PriorityQueue();
	p1.offer(12);
	p1.offer(45);
	p1.offer(67);
	p1.offer(2);
	p1.offer(89);
	System.out.println(p1);
	
	System.out.println("======poll(_)==========");
	p1.poll();
	p1.poll();
	System.out.println(p1);
	
	System.out.println("=========peek()==========");
	System.out.println(p1.peek());
	
	System.out.println("=========element()============");
	System.out.println(p1.element());
	
	System.out.println("==========remove()=============");
	p1.remove();
	System.out.println(p1);
	
	
	System.out.println("===============");
	for (Object object : p1) {
		System.out.println(object);
	}
}
}
