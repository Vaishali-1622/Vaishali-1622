package Variables;

public class GlobalVariable8 {
	//Global Variable
		int empId=123;//non-static global variable or class variable

	public static void main(String[] args) {
         System.out.println("Program starts..");
		
		//create an instance/object of a class
		GlobalVariable8 g1;  // object not created here
		g1=new GlobalVariable8(); // object create here
		System.out.println("Non-static global variable empId: "+g1.empId);//123
		
		g1.empId=456;//updating non-static global variable value
		System.out.println("updated, Non-static global variable empId: "+g1.empId);//456
		System.out.println("Program ends..");
	}

}
