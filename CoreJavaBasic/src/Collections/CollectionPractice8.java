package Collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionPractice8 {

	public static void main(String[] args) {
		HashMap <Integer,String> hm=new <Integer,String> HashMap();
		//HashMap  hm=new  HashMap();
		hm.put(1, "Apple");
		hm.put(2, "Chiku");
		hm.put(3, "Mango");
		System.out.println("HashMAp elements are....."+hm);
		System.out.println("HashMAp elements are....."+hm.get(2));
		System.out.println("HashMAp elements are....."+hm.keySet());
		System.out.println("HashMAp elements are....."+hm.values());
		for(HashMap.Entry e1:hm.entrySet()) {//entry class
			System.out.println(e1.getKey()+" "+e1.getValue());
		}

	}

}
