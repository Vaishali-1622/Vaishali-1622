package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractice1 {

	public static void main(String[] args) {
		ArrayList x1= new ArrayList();
		x1.add("Dighi");
		x1.add(123);// boxing with upcasting.. Integer obj= new Integer(123);//Unboxing... int k= obj.intValue(123);
		x1.add(6.7);
		x1.add("Mumbai");
		x1.add(true);
		x1.add(null);//first method
		x1.add("Dighi");
		System.out.println("Arraylist are: "+x1);
		System.out.println("Arraylist are: "+x1.remove(6.7));//value in boolean
		System.out.println("Arraylist are: "+x1.remove(1));//index
		
		Iterator a1= x1.iterator();
		System.out.println("Arraylist are: "+a1.hasNext());	//boolean value
		System.out.println("Arraylist are: "+a1.next());
		System.out.println("Arraylist are: "+a1.hasNext());	//boolean value
		System.out.println("Arraylist are: "+a1.next());
		System.out.println("Arraylist are: "+a1.next());
		System.out.println("Arraylist are: "+a1.next());
		System.out.println("Arraylist are: "+a1.next());
		System.out.println("Arraylist are: "+a1.hasNext());

		for (Object z1 : x1) {
			System.out.println("Arraylist are: "+z1);

		}
		System.out.println("*************************** ");

		while (a1.hasNext()) {
			System.out.println("Arraylist are: "+a1.next());	
		}
		System.out.println("Arraylist are: "+a1.hasNext());	
		System.out.println("Arraylist are: "+a1.next());	
		System.out.println("*************************** ");
		
		Iterator a2= x1.iterator();
		while (a2.hasNext()) {
			System.out.println("Arraylist are: "+a2.next());	
		}
		System.out.println("Arraylist are: "+a2.hasNext());	
		System.out.println("Arraylist are: "+a2.next());

	}
}
