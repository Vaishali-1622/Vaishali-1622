package Constructor;

	class A {
		int i;
		A() {
			System.out.println("Running Class A() constructor..");
			i=10;
		}
		void display() {
			System.out.println("I am display() of class A.");
		}
	}
	class X {
		int j = 20;
		X() {
			System.out.println("Running Class X() constructor..");
		}
		void display() {
			System.out.println("I am display() of class X.");
		}
	}
	public class Con6 {
		void display() {
			System.out.println("I am display() of class Con6.");
		}
		public static void main(String args[]) {
			System.out.println("Main() of Class Con6 is started...");
			A a1 = new A();
			a1.display();
			System.out.println("Class A global varibale i = " + a1.i);//10
			X x1 = new X();
			x1.display();
			System.out.println("Class X global varibale j = " + x1.j);//20
			Con6 c1 = new Con6();
			c1.display();
			System.out.println("Main() of Class Con6 is ends here...");
		}
	}

