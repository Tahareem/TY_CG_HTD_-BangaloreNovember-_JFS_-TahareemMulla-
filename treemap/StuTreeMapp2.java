package com.capg.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class StuTreeMapp2 {
	public static void main(String[] args) {
		
		TreeMap<String,ArrayList<Student>> t1=new TreeMap<String,ArrayList<Student>>();
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(10,"Raj"));
		a1.add(new Student(10,"Rahul"));
//		ArrayList<Student> a2=new ArrayList<Student>();
//		a2.add(new Student(11,"Annu"));
//		a2.add(new Student(11,"Tannu"));
//		ArrayList<Student> a3=new ArrayList<Student>();
//		a3.add(new Student(12,"John"));
//		a3.add(new Student(12,"Victor"));
//		
		t1.put("1st standard",a1);
//		t1.put("2nd standard",a2);
//		t1.put("3rd standard",a3);
		
		//System.out.println("1st standard");
//		System.out.println("2nd standard");
//		System.out.println("3rd standard");
		
Set<Map.Entry<String,ArrayList<Student>>> s1=t1.entrySet();
		
		for (Map.Entry<String,ArrayList<Student>> e1 : s1) 
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------");
		}
		

		
		
		
		
		
	}
}
