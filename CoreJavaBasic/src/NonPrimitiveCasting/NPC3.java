package NonPrimitiveCasting;

//Base Class
class JD {
	public void printMe1() {
		System.out.println("JournalDev print method");
	}
	void disp() {
		System.out.println("JournalDev disp method");
	}
}
//Inherited class
class Java extends JD {
	public void printMe2() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}
//Inherited class
class Android extends Java {
	public void printMe3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class NPC3 {
	public static void main(String[] args) {	
		// no casting...... and all the methods can be called
		Android a1=new Android();
		a1.printMe1();
		a1.disp();
		a1.printMe3();
		a1.printMe2();
		System.out.println("************************");
		Java jj1=new Java();
		jj1.printMe1();
		jj1.disp();
		jj1.printMe2();
		//jj1.printMe3();//shows error child most method is not called
		System.out.println("************************");
		JD s1=new JD();
		s1.printMe1();
		s1.disp();
		//s1.printMe2();//shows error child most method is not called
		//s1.printMe3();//shows error child most method is not called
		System.out.println("************************");
		JD jd1=new Android();//implicit upcasting.... child method cannot be called and in downcasting all the methods call be called
		jd1.printMe1();
		jd1.disp();
		//j1.printMe3();//shows error, not taken child class method while doing upcasting
		System.out.println("************************");
		Java j2=(Java)jd1;//explicit upcasting
		j2.printMe1();
	    j2.printMe2();
		j2.disp();//
		System.out.println("************************");
//		//Android a1=(Android)j1;//
//		a1.printMe1();
//		a1.printMe2();
//		a1.printMe3();
//		a1.disp();	//
	}
}