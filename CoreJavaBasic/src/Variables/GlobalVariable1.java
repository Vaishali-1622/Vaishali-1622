package Variables;

public class GlobalVariable1 {
	//Global Variable
		int empID=123;//non-static global variable or instance variable
		static double salary=45000.25;//static global variable or class variable
		
		public static void main(String[] args) {
			int age=30;//local variable
			System.out.println("Age: "+age);
			System.out.println("Salary: "+salary);
// non static variable can not be access directly
	}

}
/**
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 		a. static global variable or class variable -----> always contains static keyword
 *      b. non-static global variable or instance variable -----> doesn't contains static keyword
 */
