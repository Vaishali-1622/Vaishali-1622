package Methods;

public class MethodPrac2 {
	static int empID=1245;
	double salary=25000.567;
	
	public double getEmpSalary()
	{
		System.out.println("....Hi, you are in getEmpSalary()..");
		return salary;	
	}
	public static int getEmpID()
	{
		System.out.println("....Hi, you are in getEmpID()...");
		return empID;
	}

	public static void main(String[] args) {
	System.out.println("Id of the Emplyee: "+empID);
	MethodPrac2 m1= new MethodPrac2();
	System.out.println("Salary of the Emplyee: "+m1.salary);

	}

}
