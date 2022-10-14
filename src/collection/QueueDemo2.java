package collection;

import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {

		PriorityQueue queue = new PriorityQueue();
		queue.add(500);
		queue.add(200);
		queue.add(700);
		queue.add(1000);
		
		//System.out.println(queue.element());  //returns topmost or smallest element
		
		//System.out.println(queue.peek());  //returns topmost or smallest element
		
		//System.out.println("Remove element using remove() " + queue.remove());  //remove topmost or smallest element
		
       System.out.println("Remove element using poll() " + queue.poll());  //remove topmost or smallest element
 
	}

}