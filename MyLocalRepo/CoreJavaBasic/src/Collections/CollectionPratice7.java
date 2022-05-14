package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionPratice7 {

	public static void main(String[] args) {
	TreeSet t1=new TreeSet();
	t1.add("A");
	t1.add("D");
	t1.add("B");
	t1.add("E");
	t1.add("C");
	System.out.println("Elements of TreeSet: " + t1);
	System.out.println("Elements of descendingSet: " + t1.descendingSet());
	System.out.println("Elements of headSet: " + t1.headSet("D",false));
	System.out.println("Elements of subSet: " + t1.subSet("B",false,"E",false));
	System.out.println("Elements of tailSet: " + t1.tailSet("D",true));
	System.out.println("Elements pollFirst are...."+t1.pollFirst());
	System.out.println("Elements of TreeSet: " + t1);
	System.out.println("Elements pollLast are...."+t1.pollLast());
	System.out.println("Elements of TreeSet: " + t1);

	Iterator itr=t1.descendingIterator();//only use in tree set
	while(itr.hasNext()) {
		System.out.print(itr.next());
	}
	




	}

}
