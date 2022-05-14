package Independent;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Palindrome the Number........");
		getPalindrome(1221);
	}
	public static void getPalindrome(int number) {
		System.out.println("Enter the Number:"+number);
		int temp=number, reverse=0, remainder;
		while(temp!=0)
		{
			remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		if(number==reverse) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is Not Palindrome");
		}
	}
}
