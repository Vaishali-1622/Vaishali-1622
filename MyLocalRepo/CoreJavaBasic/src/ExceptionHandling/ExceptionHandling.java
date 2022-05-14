package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		try{
			System.out.println("Enter first num1: ");
			i=scn.nextInt();
			System.out.println("Enter first num2: ");
			j=scn.nextInt();
			k= i/j;//ArithmeticException
			System.out.println("res: "+k);
			System.exit(0);
		}
		catch(Throwable jj) {
			System.out.println(jj);
		}
//		catch(ArrayIndexOutOfBoundsException obj1) {
//			System.out.println("Exception handled"+obj1);
//		}
//		catch(ArithmeticException obj) {
//			System.out.println("Exception handled"+obj);//java.lang.ArithmeticException: / by zero
//			//obj.printStackTrace();//complete exception detail
//		}
		finally{
			System.out.println("Finally always excuted ");
		}
		System.out.println("Programs ends here...");
	}
}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/