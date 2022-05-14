package AssignmentPrograms;

public class Assignmentifelse4 {

	public static void main(String[] args) {
		System.out.println("............Check the LEAP YEAR........\n");
		int year=2020;
		System.out.println("Enter Year: "+year);
		if((year%100==0) && (year%400==0) || (year%100!=0) && (year%4==0))
		{
			System.out.println("LEAP YEAR");

		}
		else
		{
			System.out.println("NON LEAP YEAR");

		}
	}

}
