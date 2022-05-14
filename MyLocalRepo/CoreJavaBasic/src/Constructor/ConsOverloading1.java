package Constructor;

public class ConsOverloading1 {

	static int age;
	double salary;
	ConsOverloading1() {
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");	
	}	
	ConsOverloading1(int a) {
		System.out.println("============int Parameterized Constructor started============");
		System.out.println(" having int parameters");
		age=a;
		System.out.println("============int Parameterized Constructor Ends....============");
	}
	ConsOverloading1(double b) {
		System.out.println("============double Parameterized Constructor============");
		System.out.println(" having double parameters");
		salary=b;
		System.out.println("============double- Parameterized Constructor Ends....============");
	}
	ConsOverloading1(int a, double b) {
		System.out.println("============int-double Parameterized Constructor started============");
		System.out.println(" having int-double parameters");
		age=a;
		salary=b;
		System.out.println("============int-double Parameterized Constructor Ends....============");
		
	}
	void display(int a)
	{

		System.out.println("Types of argument:"+a);
	}
	
	public static void main(String args[]) {
		ConsOverloading1 pc1 = new ConsOverloading1();
		System.out.println("After Zero-para constructor,Age= "+age);
		System.out.println("After Zero-para constructor,Salary= "+pc1.salary);	
		pc1.display(24);

		ConsOverloading1 pc2 = new ConsOverloading1(33);
		System.out.println("After int-para constructor,Age= "+age);
		System.out.println("After int-para constructor,Salary= "+pc2.salary);
		pc2.display(45);
		
		ConsOverloading1 pc3 = new ConsOverloading1(34000.34);
		System.out.println("After double-para constructor,Age= "+age);
		System.out.println("After double-para constructor,Salary= "+pc3.salary);
		pc3.display(167);
		
		ConsOverloading1 pc4 = new ConsOverloading1(30,95000.34);
		System.out.println("After int-double-para constructor,Age= "+age);
		System.out.println("After int-double-para constructor,Salary= "+pc4.salary);
		pc4.display(123);
	}
}
