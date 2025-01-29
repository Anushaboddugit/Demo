package com.firstpackage;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
	 Queue<Integer> obj=new PriorityQueue<Integer>(Comparator.reverseOrder());
	 obj.offer(40);
	 obj.offer(29);
	 obj.offer(36);
	 obj.offer(12);
	 System.out.println(obj);
	 obj.remove();
     System.out.println(obj);
	 System.out.println(obj.peek());
	 obj.add(21);
	 System.out.println(obj);
	 obj.poll();
	 System.out.println(obj);
	 
	 
	 
	 
}
}
