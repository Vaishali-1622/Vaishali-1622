package Conditions;

public class Condition4 {

	public static void main(String[] args) {
		int i = 20;
		if (i == 10) {
			System.out.println("i is 10");//f
		}
		else if (i == 15) {
			System.out.println("i is 15");//f
		}
		else if (i == 20) {
			System.out.println("i is 20");//t
		}
		else {
			System.out.println("i is not present");//f
		}
	}
}

//==  ---> to compare two values
//>   ---> greater than
//< ----> less than
//>= ---> greater than equals to
//<= ---> less than equals to
//!= ----> not equals to
//&& ----> and
//||---->or
