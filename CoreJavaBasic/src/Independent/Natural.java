package Independent;

public class Natural {

	public static void main(String[] args) {
		System.out.println("Program to find sum of n natural number using for...");
		getSum(5);
	}
	public static void getSum(int n) {
		System.out.println("Number is:"+n);
		int i,sum=0;
		for(i=0;i<=n;i++) {
			sum=sum+i;			
		}
		System.out.println("Sum of natural numbers is:"+sum);

	}
}
