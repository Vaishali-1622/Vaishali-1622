package AssignmentPrograms;

public class Assignment5 {

	public static void main(String[] args) {
		System.out.println(".........Swapping of Two Numbers.........\n");
		int a=15, b=45;
		System.out.println("Before Swapping.....\nEnter First Number:\t"+a+"\nEnter Second Number:\t"+b);
		int temporary=a;//value of a assign to temporary
		a=b;//value of b assign to a
		b=temporary;//value of temporary(which contains the initial value of first)is assigned to b
		System.out.println("\nAfter Swapping.....\nEnter First Number:\t"+a+"\nEnter Second Number:\t"+b);
	}

}
