package Methods;

public class MethodPrac5 {

	public static void main(String[] args) {
		System.out.println("Program Using Arithematic Operators Starts Here Using Static Method.......");
		System.out.println("---------------------------------------------------");
		System.out.println("Execution Of Addition: "+MethodPrac5.Add(20, 30));
		System.out.println("...............................................");
		System.out.println("Execution Of Subtracion: "+MethodPrac5.Sub(50, 30));
		System.out.println("...............................................");
		System.out.println("Execution Of Multiplication: "+MethodPrac5.Mul(20.5, 60));
		System.out.println("...............................................");
		System.out.println("Execution Of Division: "+MethodPrac5.Div(30, 6));
		System.out.println("................Program Ends..............");
     
	}
	static int Add(int num1, int num2) {
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		int add= num1+num2;
		return add;

    }
	static int  Sub(int num1, int num2) {
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		int sub= num1-num2;
		return sub;
    }
    static double Mul(double num1, double num2) {
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		double mul= num1*num2;
		return mul;
    }

	static float Div(float num1, float num2) {
			System.out.println("Number1 is: "+num1);
			System.out.println("Number2 is: "+num2);
			float div= num1/num2;
			return div;
    }		
}


	
