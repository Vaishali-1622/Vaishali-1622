package Constructor;

public class ConsMethodOverloading {

		/* fix the error in */

		double sum(int g, int h) {
			System.out.println(g + h);
			return (g + h);
		}

		double sum(int g, double h) {
			System.out.println(g + h);
			return (g + h);
		}

		public static void main(String args[]) {
			ConsMethodOverloading ob = new ConsMethodOverloading();
			double result = ob.sum(20, 20);
			System.out.println("Result: "+result);

			double result2 = ob.sum(20, 20.56);
			System.out.println("Result2: "+result2);

		}
	}