package Variables;

public class Try1{
    static int age=40, salary=12000;//Non-static global variable

	public static void main(String[] args) {
    System.out.println("Pogram to execute Non-Static Variables:");
    int empID=1234, salary1=30000;
	System.out.println("ID of the Employee: "+empID);
	System.out.println("Salary of the Employee: "+Try1.age);
	System.out.println("Salary of the Employee: "+Try1.salary);
	System.out.println("Salary of the salary1: "+salary1);

	}

}
