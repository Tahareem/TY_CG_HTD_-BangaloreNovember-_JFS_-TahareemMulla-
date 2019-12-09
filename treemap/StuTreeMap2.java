package com.capg.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StuTreeMap2 {
	public static void main(String[] args) {
		TreeMap<Student,String> t1=new TreeMap<Student,String>();
		
		t1.put(new Student(7,"Raj"),"1st standard");
		t1.put(new Student(8,"Raj"),"2nd standard");
		t1.put(new Student(14,"Raj"),"8th standard");
		
		Set<Map.Entry<Student, String>> s1=t1.entrySet();
		
		for (Map.Entry<Student, String> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------");
		}
		
		System.out.println(new Student(7,"Raj"));
		
		
	}
}
