package Independent;

public class Leap {

	public static void main(String[] args) {
		System.out.println("Find leap yera........\n");
		getYear(2000);
	}

	public static void getYear(int year) {
		System.out.println("Enter Year:" + year);
		if ((year % 100 == 0) && (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("The given Year is Leap Year");
		} else {
			System.out.println("The given Year is Not Leap Year");

		}
	}
}
