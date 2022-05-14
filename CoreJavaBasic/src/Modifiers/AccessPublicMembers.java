package Modifiers;

//import Methods.MethodPrac1;

public class AccessPublicMembers {

	public static void main(String[] args) {
		
		Methods.MethodPrac1 a1= new Methods.MethodPrac1();//classname of that package which we have to access
		System.out.println("Accessing Public members from another class within same package");
		//System.out.println("Accessing Public members"+Methods.MethodPrac1());

		a1.addInteger(12,15);
	}
}
