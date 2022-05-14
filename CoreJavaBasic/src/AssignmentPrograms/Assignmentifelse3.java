package AssignmentPrograms;

public class Assignmentifelse3 {

	public static void main(String[] args) {
		System.out.println("............Largest Among Three numbers........\n");
		int num1=5555, num2=60000, num3=70000;
		System.out.println("Enter The First Number: "+num1+"\nEnter The Second Number: "+num2+"\nEnterThe Third Number: "+num3);
		if(num1<num2)
		{
			if(num1<num3)
	
				System.out.println("\nNumber First is largest");
			else 
				System.out.println("\nNumber Third is largest");

			}
		else 
		{
			if(num2<num3)
				System.out.println("\nNumber second is largest");
			else
				System.out.println("\nNumber Third is largest");


			}
				
			
	}
}
	