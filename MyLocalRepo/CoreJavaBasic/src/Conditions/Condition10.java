package Conditions;

public class Condition10 {

	public static void main(String[] args) {
		/*
		 * num==2, num%num=0,num!=0,num!=1
		 */
		int num=3;
		if(num==0 || num==1) {
			System.out.println("not a prime number : "+num);//f
		}else if(num%num==0 ) {
			System.out.println("Number is prime: "+num);//t
		}else {
			System.out.println();
		}
	}
	

}
