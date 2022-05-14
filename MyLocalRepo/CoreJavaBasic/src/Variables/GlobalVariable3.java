package Variables;

public class GlobalVariable3 {
	//Global Variable
		static int empId=123;//static global variable or class variable

	public static void main(String[] args) {
        int empId=100,age=30;//local Variable
		System.out.println("Local Variable, EmpID: "+empId);//100
		System.out.println("Local Variable, Age: "+age);//30
		System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable3.empId);//123		

	}

}
