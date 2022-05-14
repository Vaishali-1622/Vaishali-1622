package Independent;

public class EvenAndOdd {

	public static void main(String[] args) {
		System.out.println("Program to find Even & Odd number using If else...");
		getEven(99);

	}

	static void getEven(int x) {
		System.out.println("Number is:" + x);
		if (x % 2 == 0) {
			System.out.println("Given Number is Even");
		} else {
			System.out.println("Given Number is Odd");
		}
		getOdd(17);
	}

	static void getOdd(int y) {
		System.out.println("**********************************");
		System.out.println("Number is:" + y);
		for (int i = y; i % 2 == 0; i++) {
			System.out.println("Given Number is Even");
		}
		for (int i = y; i % 2 != 0; i++) {
			System.out.println("Given Number is Odd");
		}

	}
}
