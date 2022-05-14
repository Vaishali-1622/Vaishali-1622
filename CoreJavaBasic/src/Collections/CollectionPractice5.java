package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionPractice5 {

	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
		// while adding element in Queue, it will always keep smallest element on the top
		queue.add(123);
		queue.add(245);
		queue.add(10);
		queue.add(50);
		queue.add(-2);
		System.out.println("Size: " + queue.size());
		System.out.println("Eleements of Queue: " + queue);
	}

}
