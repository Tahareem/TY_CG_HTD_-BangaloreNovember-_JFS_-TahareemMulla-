package com.capg.queue;

import java.util.PriorityQueue;

public class StuPriorityQueue3 {
	public static void main(String[] args) {
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		
		p1.offer(new Student(22,"John"));
		p1.offer(new Student(23,"Jack"));
		p1.offer(new Student(22,"John"));
		
		for (Student student : p1) {
			System.out.println(student);
		}
		
	}
}
