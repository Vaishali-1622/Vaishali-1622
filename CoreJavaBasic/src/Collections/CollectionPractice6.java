package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionPractice6 {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Sir ji");
	a1.add("Riddle");
	a1.add("Hello");
	HashSet h1=new HashSet(a1);
	h1.add("Hello");
	h1.add(67);
	h1.add("Hello");
	h1.add("Dipam ji");
	h1.add(null);
	
	System.out.println("Elements of HashSet: " + h1);
	h1.remove(67);
	System.out.println("Elements of HashSet: " + h1);

	}

}
