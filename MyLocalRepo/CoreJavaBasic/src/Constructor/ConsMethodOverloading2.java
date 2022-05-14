package Constructor;

public class ConsMethodOverloading2 {

		public static void main(int args) {
			System.out.println("Main Method with int argument Executing: "+args);
			
		}

		public static void main(char args) {
			System.out.println("Main Method with char argument Executing: "+args);
			//System.out.println(args);
		}

		public static void main(String[] args) {
			System.out.println("Original main Executing");
			ConsMethodOverloading2.main(12);
			ConsMethodOverloading2.main('c');
			ConsMethodOverloading2.main(1236);
		}
	}

