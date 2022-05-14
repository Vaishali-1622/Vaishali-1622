package AssignmentPrograms;

public class Assignmentforloop7 {

	public static void main(String[] args) {
		System.out.println("............Reverse a number........\n");

		int number = 123456, reverse = 0;  
		System.out.println("Enter the Number: "+number);

		//we have not mentioned the initialization part of the for loop  
		for( ;number != 0; )   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number=number/10;
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
}  