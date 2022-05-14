package AssignmentPrograms;

public class Assignmentwhileloop5 {

	public static void main(String[] args) {

		{int num=2222;double  sum=0;int b=num;int c=0;int e=num;
		while(b!=0) {
		//	int d=b%10;
			b=b/10;
			c=c+1;
		}
		
		while(e!=0)
		{double rem=e%10;
		sum=sum+Math.pow(rem, c);
		e=e/10;
			
		}System.out.println(" sum = "+sum);
	
	if (num==sum) {
		System.out.print("The number "+num+" is armstrong Number");
	}else
		System.out.print("The number "+num+" is not armstrong Number");
		}}
		
}
	