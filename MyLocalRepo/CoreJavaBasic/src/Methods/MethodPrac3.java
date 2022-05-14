package Methods;

public class MethodPrac3 {

	public static void main(String[] args) {
		System.out.println("Program for Addition of Three Numbers Starts Here:");
		
		int res= MethodPrac3.addThreeNumbers(30, 50, 100);
		System.out.println("Final Result=: "+res);
		System.out.println(".......................................");
		int finalresult= MethodPrac3.addThreeNumbers(5, 50, 500);
		System.out.println("Final Result=: "+finalresult);
		System.out.println("Program for Addition of Three Numbers Ends Here......");
	}
    static int addThreeNumbers(int a, int b, int c) {
		System.out.println("First Number: "+a);
		System.out.println("Second Number: "+b);
		System.out.println("Third Number: "+c);
		int result= a+b+c;
		return result;
    }
}
