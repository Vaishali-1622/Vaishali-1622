package Independent;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Program to find prime number...");
		getPrime(4);
	}

	public static void getPrime(int x) {
		System.out.println("Enter the number:" + x);
		int i, temp = 0;
		for (i = 2; i <= x - 1; i++) {
			if (x % i == 0) {
				temp = +1;
			}
		}
		if (temp == 0) {
			System.out.println("Number is  Prime");
		} else {
			System.out.println("Number is Not Prime");
		}

	}
}
