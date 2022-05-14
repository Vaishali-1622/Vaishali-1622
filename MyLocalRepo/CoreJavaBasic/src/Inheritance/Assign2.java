package Inheritance;

public class Assign2 {

	public static void main(String[] args) {
		employee m1 = new employee(31);// call child constructor
		employee m2 = new employee(31.5);// call child constructor
		m1.getsalary(28);// call child employee method
		m2.getsalary(65.23);// call child employee method

	}
}
class company {
	int salary = 46;// global variable
	// Constructor Overloading
	company(int salary){ 
		System.out.println("company cons: "+salary);// call local variable 16
		System.out.println("company cons: "+this.salary);//call global variable 46
	} 
	company(double salary){
		System.out.println("company cons: "+salary);// call local variable 16.5
		System.out.println("company cons: "+this.salary);//call global variable 46
	}
	// Method Overloading
	void getsalary(int salary) {
//		we can call only one method from child object by using "this" 
//      this.getsalary(25.5); // show eroor 
		this.getsalary(90.5);// call child method of double data type
		System.out.println("company method: "+salary);//local variable 75
		System.out.println("company method: "+this.salary);//global variable 46
	}
	void getsalary(double salary) {
//    this.getsalary(90);// call child method having int type
		System.out.println("company method: "+salary);//local variable 75.6
		System.out.println("company method: "+this.salary);//global variable 46
	}
}
class employee extends company{
	int salary = 56;// global variable
	// Constructor Overloading
	employee(int salary){
		super(16);// use to call parent constructor
		System.out.println("employee cons: "+salary);// call local variable 31
		System.out.println("employee cons: "+super.salary);//call global variable 46
	}  // super use to call global variable of parent object
	   // while this is use to call global variable of current object
	employee(double salary){
		super(16.5);// use to call parent constructor
		System.out.println("employee cons: "+salary);//local variable 31.5
		System.out.println("employee cons: "+this.salary);//global variable 56
	}
	// Method Overloading
	void getsalary(int salary) {
		super.getsalary(75);// use to call parent method (int)
		System.out.println("employee method: "+salary);//local variable 28
		System.out.println("employee method: "+this.salary);//global variable 56
	}
	void getsalary(double salary) {
		super.getsalary(75.6);// use to call parent method (double)
		System.out.println("employee method: "+salary);//local variable 65.3
		System.out.println("employee method: "+super.salary);//global variable 46
	}
}