package Independent;

public class ReverseWithZero {

	public static void main(String[] args) {
		System.out.println("Reverse the Number with Zero........");
		getReverse(1210);
	}

	public static void getReverse(int num) {
		System.out.println("Number is:" + num);
		int reverse = 0;
		System.out.print("The Reverse Number is:");
		if(num%10==0) {
			System.out.print("0");
		}
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println( reverse);
	}

	// by using for loop
	public static void getR(int num) {
		System.out.println("Number is:" + num);
		int reverse = 0;
		for (; num != 0;) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The Reverse Number is:" + reverse);
	}
}
