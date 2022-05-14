package NonPrimitiveCasting;

public class Pratice {
	public static void main(String[] args) {
		Mobile a1= new laptop();//Mobile a1= (Mobile) new laptop();  Implicit upcasting
		Mobile a2=a1;
		Mobile a3;
		Mobile a4= (Mobile)a1;// Explicit Upcasting
		Mobile a5= (Mobile) new laptop();
		laptop a6= (laptop)a1;// Downcasting
		a6.m4();//can be call by child class using reference variable	
		Pratice p1=new Pratice();
		p1.getPratice(a4);
	}
		void getPratice(Mobile a7) {//upcasting
			laptop a8=(laptop)a7;//downcasting
			a8.m1();
			a8.m2();
			a8.m4();
		}
}
class Mobile{
	void m1() {
		System.out.println("Mobile");
	}
	void m4() {
		System.out.println("Mmmmmmm");
	}
}

class laptop extends Mobile{
	void m1() {
		System.out.println("Laptop");
	}
	void m2() {
		System.out.println("Television");
	}
}