package Constructor;

public class Con3 {
		int age;
		double salary;
		/**
		 *  below is default constructor, that will be written by java compiler at compile time
		  Cons2(){
				//empty body
			}
		*/

		public static void main(String[] args) {

			Con3 c1 = new Con3();
			System.out.println(c1.age);// 0
			System.out.println(c1.salary);// 0.0
		}
	}
