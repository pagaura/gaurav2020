package collection;

import java.util.PriorityQueue;

public class QueueDemo1 {

public static void main(String[] args) {
		
		PriorityQueue queue = new PriorityQueue();
		queue.add("Mango");
		queue.add("Apple");
		//queue.add(500);
		//queue.add(200);
		//queue.add(700);
		//queue.add(100);
		//queue.add(700);
		//queue.add('A');
		//queue.add(7000.50);
		
		//System.out.println(queue.size());
		
		System.out.println(queue);
	
		//For each loop is preferable over for loop in queue
		/* 
		for(Object i : queue) {
			System.out.println(i);
		}
		*/
	}

}