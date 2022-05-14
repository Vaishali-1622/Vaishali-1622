package Constructor;

public class Con2 {

	Con2() {
			System.out.println("This is a zero-para constructor");
		}
		Con2(char c) {
			System.out.println("This is a single-para constructor");
			
		}
		Con2(int num1, int num2) {
			System.out.println("This is a int-int parameterized constructor");
		}	
		Con2(double num1, int num2) {
			System.out.println("This is a double-int parameterized constructor");
		}
		Con2(int num1, double num2) {
			System.out.println("This is a int-double parameterized constructor");
		}
		Con2(double num1, boolean num2,char c) {
			System.out.println("This is a double-int parameterized constructor");
		}
		void display() {
			System.out.println("Type of Argument:- ");

		}
		public static void main(String[] args) {
			Con2 c1 = new Con2();
			c1.display();
			
			Con2 c2 = new Con2(10, 20);
			c2.display();

			Con2 c3 = new Con2('d');
			c3.display();

			Con2 c4 = new Con2(10d, 20);
			c4.display();

			Con2 c5 = new Con2(10, 20.45);
			c5.display();

			Con2 c6 = new Con2(10,false,'x');
			c6.display();

			
		}
	}

	/**
	 * Constructor Overloading: more than on constructor in a class 
	 * Rule: 1. type of args differ or 
	 * 		 2. number of args differ or 
	 * 		 3. position of args differ
	 * 
	 */
