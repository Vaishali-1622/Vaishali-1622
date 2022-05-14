package Variables;

public class GlobalVariable2 {
	//Global Variable
		static double empId=123;//static global variable or class variable
		
		public static void main(String[] args) {
				System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable2.empId);
				System.out.println("Direct way to access SGV, EmpID: "+empId);

	}

}
/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 	a.static global variable or class variable:
		1. declared with static keywords
		2. class variable or class member
		3. loaded in the memory at compile time because they are class member
		4. can be access using classname or directly inside another static method
				classname.staticvariablename
		5. for static member memory location happens only once  
 */
