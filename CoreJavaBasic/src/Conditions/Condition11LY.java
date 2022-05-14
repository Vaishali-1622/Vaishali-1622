package Conditions;

public class Condition11LY {

	public static void main(String[] args) {
		int year = 2028;
		System.out.println("Enter Year: "+year);

		if (((year % 100 == 0) && (year % 400 == 0)) || (year % 100 != 0) && (year % 4 == 0)) {
			System.out.println("LEAP YEAR");
		} else {
			System.out.println("COMMON YEAR or NON LEAP YEAR");//
		}

	}
	
}
