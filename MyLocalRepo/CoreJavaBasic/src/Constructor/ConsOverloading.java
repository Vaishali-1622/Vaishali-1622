package Constructor;

public class ConsOverloading {

	ConsOverloading() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ConsOverloading(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ConsOverloading(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	ConsOverloading(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}	
	ConsOverloading(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}
	void display() {
		System.out.println("Types of argument:");
	}
	
	
	public static void main(String args[]) {
		ConsOverloading pc5 = new ConsOverloading();
		pc5.display();
		ConsOverloading pc1 = new ConsOverloading(12);
		pc1.display();

		ConsOverloading pc2 = new ConsOverloading(13.34);
		pc2.display();

		ConsOverloading pc3 = new ConsOverloading(10,13.34,45);
		pc3.display();

		ConsOverloading pc4 = new ConsOverloading(13.34,23,87);
		pc4.display();

	}
	
}

/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */
