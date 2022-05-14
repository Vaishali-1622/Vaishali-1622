package Variables;

public class GlobalVariable9 {
	//Global Variable
		int empId=123;//non-static global variable or class variable

	public static void main(String[] args) {
        System.out.println("Program starts..");
		
		//create an instance/object of a class
		GlobalVariable9 g1;  // object not created here
		g1=new GlobalVariable9(); // object create here
		System.out.println("Non-static global variable empId with g1 ref: "+g1.empId);//123
		g1.empId=456;//updating non-static global variable value
		System.out.println("updated, Non-static global variable empId with g1 ref: "+g1.empId);//456
		
		//creating again new instance
		GlobalVariable9 g2 = new GlobalVariable9();
		System.out.println("Non-static global variable empId with g2 ref: "+g2.empId);//123
		System.out.println("Program ends..");
	}

}
