package Practice;

public class MockGroup3 {

	public static void main(String[] args) {
		Maths M1 = new Maths(15, 7.8);
		M1.getAnswer(30, 11);
		M1.getAsciiValue('A');
		M1.checkOddEven(89);
	}
}
//parent class
class Vedic {
	// constructor overloading
	Vedic(int a) {
		this(1.1);
		System.out.println("Parent value: " + a);
	}

	Vedic(double b) {
		this(15, 3.3);
		System.out.println("Parent value: " + b);
	}

	Vedic(int c, double d) {
		double var = c * d;
		System.out.println("Parent value: " + var);
	}

//method overriding in child
	void getAnswer(int a, int b) {
		double result1 = a / b;
		double result2 = a % b;
		System.out.println("Resullt in Quotient: " + result1);
		System.out.println("Resullt in Remainder: " + result2);

	}

	void getAsciiValue(int value) {
		System.out.println("ASCII value 1: " + value);
	}

//static method overloading
	public static void checkEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("Number is Positive:" + num);
		} else {
			System.out.println("Number is Negative" + num);
		}
		checkEvenOdd1(45l);
	}

	public static void checkEvenOdd1(long num) {
		if (num % 2 == 0) {
			System.out.println("Number is Positive:" + num);
		} else {
			System.out.println("Number is Negative:" + num);

		}
	}
}

//child class
class Maths extends Vedic {
//constructor overloading
	Maths(int a, double c) {
		this(8);
		double result = a + c;
		System.out.println("Parent value: " + result);
	}

	Maths(int b) {
		this(66.7);
		System.out.println("Parent value: " + b);
	}

	Maths(double d) {
		super(22);
		System.out.println("Parent value: " + d);
	}

//method overriding
	void getAnswer(int a, int b) {
		super.getAnswer(16, 8);// Execute both the methods of the class
		double res1 = a / b;
		double res2 = a % b;
		System.out.println("Res1 in Quotient: " + res1);
		System.out.println("Res2 in Remainder: " + res2);
	}

	void getAsciiValue(int val) {
		//this.getAnswer(2,3);
		System.out.println("ASCII value 2: " + val);
	}

//non static method overloading....
	public void checkOddEven(int num) {
		checkOddEven1(15);
		if (num % 2 == 0) {
			System.out.println("Number is Positive:" + num);
		} else {
			System.out.println("Number is Negative:" + num);

		}

	}

	public void checkOddEven1(long num) {
		super.checkEvenOdd(34);
		if (num % 2 == 0) {
			System.out.println("Number is Positive" + num);
		} else {
			System.out.println("Number is Negative" + num);

		}
	}

}
