package Variables;

public class VariablePrac3 {
	static int rollNum=456;
	static boolean result;
	
	double payment=4500.56;
	char grade;

	public static void main(String[] args) {
		System.out.println("Program starts..");
		
		//access static & non-static global variable
		System.out.println("SGV rollNum: "+rollNum);//static 456
		System.out.println("SGV result: "+result);//static false
		
		VariablePrac3 g1 = new VariablePrac3();//object created
		System.out.println("NSGV payment: "+g1.payment);//non static 4500.56
		System.out.println("NSGV grade: "+g1.grade);//non static  blank
		
		//update the value of static & non-static global variable
		rollNum=500;//static
		result=true;//static
		
		g1.payment=54220.56;//non static
		g1.grade='A';//non static		
		
		//access the updated value of static & non-static global variable
		System.out.println("updated, SGV rollNum: "+rollNum);//500
		System.out.println("updated, SGV result: "+result);//true
		System.out.println("updated, NSGV payment: "+g1.payment);//54220.56
		System.out.println("updated, NSGV grade: "+g1.grade);//A
		System.out.println("Program ends..");
	}

}
