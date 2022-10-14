package collection;

import java.util.PriorityQueue;

public class QueueDemo3 {

	public static void main(String[] args) {

		PriorityQueue queue = new PriorityQueue();
		
		System.out.println(queue.element());  //No such element exception will be display if queue is empty or blank
		
		//System.out.println(queue.peek());  //null will be display if queue is empty or blank
		
		//System.out.println("Remove element using remove() " + queue.remove());  //No such element exception will be display if queue is empty or blank
		
		//System.out.println("Remove element using poll() " + queue.poll());  //null will be display if queue is empty or blank

	}

}
