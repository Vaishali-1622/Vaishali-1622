package Variables;

public class GlobalVariable7 {
	//Global Variable
		int empId=123;//non-static global variable or class variable
		
	public static void main(String[] args) {
         System.out.println("Program starts..");
		
		//create an instance/object of a class
		GlobalVariable7 g1;  // object not created here
		g1=new GlobalVariable7(); // object create here
		
		System.out.println("Non-static global variable empId: "+g1.empId);
		System.out.println("Program ends..");
	}

}
/*
 * Global Variable: a variable declared outside the method body but present inside the class body known as global variable
 * types:
 * 	a.non-static global variable or instance variable:
		1. declared without static keywords
		2. known as instance/object member
		3. loaded in the memory at run time because they are instance/object member which are created at runtime
		4. create an instance: 
				classname referencevariable;        // no object created
				referencevariable = new className();// object created
							//or
				classname  referenacevariable = new classname();
		5. to access them you need to use 
				referenacevariable.nonstaticvariablename;
				//or you can access nonstaticvariable directly from another nonstatic method
		5. for non-static member memory location happens multiple times based on object creation 
 */