package Methods;

public class MethodPrac4 {

	public static void main(String[] args) {
     ArithematicOp(30, 40);
	 System.out.println("*****************");
     MethodPrac4.ArithematicOp(90, 50);
     
	}
	static void ArithematicOp(int num1, int num2) {
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		int op1 = num1+num2;
		int op2 = num1*num2;
		int op3 = num1-num2;
		int op4 = num1/num2;
		System.out.println("Result of Addition: "+op1+"\n Result of Multiplication: "+op2+"\n Result of Subtraction: "+op3+"\n Result of Division: "+op4);


}
}
