package com.capg.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		 a1.add(45);
		 a1.add(78);
		 a1.add(52);
		 a1.addFirst(23);
		 a1.add(12);
		 System.out.println(a1);
		 
		 System.out.println(a1.getFirst());
		 
		 System.out.println(a1.getLast());
		 
		 System.out.println(a1.removeFirst());
		 System.out.println(a1);
		 
		 System.out.println(a1.peek());
		 
		 Iterator itr=a1.iterator();
		 while(itr.hasNext());
		 {
			 System.out.println(itr.next());
		 }
	}
}
