package Operators;

public class LogicalOp1 {

	public static void main(String[] args) {
		//Variables Definition and Initialization
		  boolean bool1 = true, bool2 = false;

		  //Logical AND
		  System.out.println("bool1 && bool2 = " + (bool1 && bool2));//f
		  
		  //Logical OR
		  System.out.println("bool1 || bool2 = " + (bool1 | bool2) );//t
		  
		  //Logical Not
		  System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));//t

		 }
		}