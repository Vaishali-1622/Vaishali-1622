package Variables;

public class GlobalVariable10 {
	//Global Variable
		int empId;
		static double salary;

	public static void main(String[] args) {
		System.out.println("Program starts..");
		System.out.println("****************Access static global variable**********************");
		System.out.println("SGV salary: "+salary);//0.0
		System.out.println("With Std, SGV salary: "+GlobalVariable10.salary);//0.0
		System.out.println("****************Access non-static global variable**********************");
		GlobalVariable10 v1=new GlobalVariable10();
		System.out.println("NSGV empId: "+v1.empId);//0
		System.out.println("Program ends..");
	}

}
