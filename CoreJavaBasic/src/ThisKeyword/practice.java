package ThisKeyword;

public class practice {

	static int age;
	int salary;//global variable
	int empId;
	static double display(int salary) //int salary=45000;
	{
		System.out.println("Salary"+salary);//45000
		return salary;
		//System.out.println("Salary"+this.salary);//0
		//this.salary=35000;
		//System.out.println("Salary"+this.salary);//35000
	}
	static void display(double salaray) {
		
		display(34);
		System.out.println("Salary will be as: "+salaray);
	}
	
	public static void main(String[] args) {
		display(20.1);
	//	int age=25;
//		System.out.println("age: "+age);//25
//		System.out.println("global age:"+ThisKeyword.age);//0
//		int salary=25000;//local variable
//		int empId=250;
//		System.out.println("local Salary: "+salary);//25000
//		System.out.println("Local EmpId: "+empId);//250
//		ThisKeyword t1=new ThisKeyword();
//		System.out.println("t1: Global EmpID: "+t1.empId);//0
//		System.out.println("t1: Global Salary: "+t1.salary);//0
//		t1.display(45000);
//		System.out.println("t1: Global Salary: "+t1.salary);//35000
//		ThisKeyword t2=new ThisKeyword();
//		System.out.println("t2: Global EmpID: "+t2.empId);//0
//		System.out.println("t2: Global Salary: "+t2.salary);//0
//		t2.display(1000);	
		
	}
}