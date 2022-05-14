package FinalKeyword;

public class FinalKeyword5 {


	int cube(final int n){ //final int n=5;
		System.out.println(n);//5
		   //n=n+2;//can't be changed as n is final  
		   return n*n*n;  
		  }

	public static void main(String args[]) {
		FinalKeyword5 b = new FinalKeyword5();
		System.out.println(b.cube(5));
	}
}