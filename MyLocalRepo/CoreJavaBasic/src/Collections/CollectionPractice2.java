package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionPractice2 {

	public static void main(String[] args) {
		PriorityQueue q1= new PriorityQueue();
		q1.add(12);
		q1.add(99);
		q1.add(55);
		q1.add(1);
		System.out.println("Arraylist are: "+q1);
		//q1.clear();
		//System.out.println("Arraylist are: "+q1.element());//exception
		//System.out.println("Arraylist are: "+q1.peek());//null
		System.out.println("Arraylist are: "+q1.remove());//exception
		System.out.println("Arraylist are: "+q1.poll());//null


	}

}
