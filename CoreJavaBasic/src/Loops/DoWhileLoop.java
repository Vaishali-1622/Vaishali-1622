package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		int c = 6;
		System.out.println("Printing all the numbers");
		do {
			// printing all the numbers till 10
			System.out.println(c);
			++c;
		} while (c < 5);
	}
}
