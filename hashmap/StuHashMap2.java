package com.capg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class StuHashMap2
{
	public static void main(String[] args) {
		HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
		
		h1.put(44, new Student(33,"Tannu"));
		h1.put(54, new Student(11,"annu"));
		h1.put(64, new Student(99,"mannu"));
		
		h1.put(null, null);
		
		h1.put(null, new Student(67,"raj"));
		h1.put(44, new Student(23,"Tannu"));
		
		Collection<Student> c1=h1.values();
		
		for(Student s1:c1) {
			System.out.println(s1);
		}
		
		System.out.println(h1.containsKey(44));
		
		System.out.println(new Student(33,"Tannu"));
		
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		
	}
}
