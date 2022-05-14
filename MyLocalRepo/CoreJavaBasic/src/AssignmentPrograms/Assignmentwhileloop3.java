package AssignmentPrograms;

public class Assignmentwhileloop3 {

	public static void main(String[] args) {
		System.out.println("............Check Palindrome number........\n");

		int num = 1221, reversed =0,count=0,
	    palindrom = num;
	    System.out.println("original number: "+num);
		          // run loop until num becomes 0
  while(num!=0) { // if we need to execute program by using for loop just use (;num!0;)
		       	   //get last digit from num
		 int digit = num%10;//5678/%10=8, 567%10=7, 56%10=6,5%10=5
		 reversed = reversed*10+digit;// (0 = 0*10+8, 8 = 8*10+7 ,87=87*10+6, 876=876*10+5) = 8765
		    // remove the last digit from num
		    num = num/10;// 5678/10 = 567, 567/10= 56, 56/10=5, for use to remove digit
		     ++count;// variable assign to count the digit
		 }if( reversed == palindrom){
		        	  System.out.println("palindrome number : "+reversed);
		 }else {
		          System.out.println(" not palindrome number : "+reversed);// from number line we got reversed digit
			}
         System.out.println("total digit: "+count);

			}
		}