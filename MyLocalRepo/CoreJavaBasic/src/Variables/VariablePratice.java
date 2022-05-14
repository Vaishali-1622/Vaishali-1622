package Variables;

public class VariablePratice {
	static int age=40, salary=12000;//static global variable

	public static void main(String[] args) {
    System.out.println("Program to execute Local and Global Variables:");
    int empID=1234, salary=20000;
	System.out.println("ID of the Employee: "+empID);
	System.out.println("Age of the Employee: "+age);
	System.out.println("Age of the Employee: "+salary);
	System.out.println("Salary of the Employee: "+VariablePratice.salary);
	}

}
