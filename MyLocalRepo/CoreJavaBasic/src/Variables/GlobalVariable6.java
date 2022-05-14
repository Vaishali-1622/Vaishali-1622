package Variables;

public class GlobalVariable6 {
	//Global Variable
		static int empId=123;//static global variable or class variable

	public static void main(String[] args) {
		int age=30;//local Variable
		System.out.println("Local Variable, Age: "+age);//30
		age=45;
		System.out.println("Updated, Local Variable, Age: "+age);//45
		System.out.println("Direct way to access SGV, EmpID: "+empId);//123
		System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable6.empId);//123	
		empId=456;
		System.out.println("updated, Direct way to access SGV, EmpID: "+empId);//456
		System.out.println("updated, Standard way to access SGV, EmpID: "+GlobalVariable6.empId);//456	
	}

}
