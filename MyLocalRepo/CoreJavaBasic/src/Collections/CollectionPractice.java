package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionPractice {

	public static void main(String[] args) {
	ArrayList obj=new ArrayList();
	obj.add("Dighi");
	obj.add(123);// boxing with upcasting.. Integer obj= new Integer(123);//Unboxing... int k= obj.intValue(123);
	obj.add(6.7);
	obj.add("Mumbai");
	obj.add(true);
	obj.add(null);//first method
	obj.add("Dighi");
	System.out.println("Arraylist are: "+obj);
	System.out.println("Arraylist are: "+obj.size());
	obj.add(1, 456);
	System.out.println("Arraylist are: "+obj);
	System.out.println("Arraylist are: "+obj.size());
	System.out.println("Arraylist are: "+obj.get(3));
	obj.set(1, 888);//second method
	System.out.println("Arraylist are: "+obj);
    ArrayList b1=new ArrayList();
    b1.add("Pune");
    b1.add("Mumbai");
	System.out.println("Arraylist are: "+b1);
	System.out.println("Arraylist are: "+b1.size());
	//b1.add(obj);//third method
	//System.out.println("Arraylist are: "+b1);
	//b1.addAll(obj);//third method type
	b1.addAll(1, obj);//fourth method type
	System.out.println("Arraylist are: "+b1);
	ArrayList v1=new ArrayList();
	v1.add(909);
	v1.add("Water");
	ArrayList v2=new ArrayList();
	v2.add("Water");
	v2.add("Oil");
	v2.retainAll(v1);//fifth method type
	System.out.println("Arraylist of v are: "+v2);
	v2.clear();
	System.out.println("Arraylist of v are: "+v2);
	System.out.println("Arraylist of v are: "+v2.isEmpty());
	v2.add("Cricket");
	System.out.println("Arraylist of v are: "+v2.isEmpty());
	ArrayList<Integer> bbb= new <Integer>ArrayList();//Generic way
	bbb.add(12);
	bbb.add(1);
	bbb.add(55);
	bbb.add(99);
	System.out.println("Arraylist of v are: "+bbb);
	Collections.sort(bbb);
	System.out.println("Arraylist of v are: "+bbb);
	Collections.reverse(bbb);
	System.out.println("Arraylist of v are: "+bbb);
	//bbb.removeIf(int->bbb.contains(55));
	System.out.println("Arraylist of v are: "+bbb.remove(1));
	System.out.println("Arraylist of v are: "+bbb);



	}

}
