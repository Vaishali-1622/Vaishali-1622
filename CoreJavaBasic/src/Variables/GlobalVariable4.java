package Variables;

public class GlobalVariable4 {
	//Global Variable
		static int empId=123;//static global variable or class variable

	public static void main(String[] args) {
        int age=30;//local Variable
        System.out.println("Local Variable, Age: "+age);//30
		System.out.println("Direct way to access SGV, EmpID: "+empId);//123
		System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable4.empId);
	}

}
