package Methods;

public class MethodPrac6 {

	public static void main(String[] args) {
		System.out.println("Program Using Arithematic Operators Starts Here Using Non Static Method.......");
		System.out.println("---------------------------------------------------");
		MethodPrac6 op1= new MethodPrac6();
		double result=op1.Add(30, 45);
		System.out.println("Result of Addition = "+result);
		System.out.println("...............................................");
		System.out.println("Result Of Subtracion: "+op1.Sub(50, 20));
		System.out.println("...............................................");
		System.out.println("Result Of Multiplication: "+op1.Mul(20.5, 90));
		System.out.println("...............................................");
		op1.Div(40, 5);
		System.out.println("................Program Ends..............");
     
	}
	public int Add(int num1, int num2) {
		return num1+num2;

    }
	private int Sub(int num1, int num2) {
		return num1-num2;
    }
    protected double Mul(double num1, double num2) {
		return num1*num2;
    }

    void Div(float num1, float num2) {
			float div= num1/num2;
			System.out.println("Result of Division is: "+div);
    }		
}


	
