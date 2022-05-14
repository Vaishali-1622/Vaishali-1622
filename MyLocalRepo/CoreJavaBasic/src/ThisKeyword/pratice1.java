package ThisKeyword;

public class pratice1 {

	static final int age=13;
	int salary;//global variable
	int empId;
	 double display(int salary) //
	{
		 this.display(456.89);
		System.out.println("Salary"+salary);//
		return salary;
		
	}
	void display(double salaray) {
		
		System.out.println("Salary will be as: "+salaray);
		System.out.println("Salary will be as: "+this.salary);

	}
	
	
	public static void main(String[] args) {
		pratice1 boj=new pratice1();
		boj.display(35);


		
	}
}