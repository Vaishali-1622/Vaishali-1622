package AssignmentPrograms;

public class Assignmentswitch1 {

	public static void main(String[] args) {
		System.out.println("............Simple Calculator........\n");
		int num1=50, num2=34, res;
		char operation = '+';
		switch (operation){
			case '+':
					  res=num1+num2;
					 System.out.println("Addition of two numbers is: "+res);
					 break;
			case '-':
					  res=num1-num2;
					 System.out.println("Subtraction of two numbers is: "+res);
					 break;
			case '*':
				      res=num1*num2;
				     System.out.println("Multiplication of two numbers is: "+res);
				     break;
			case '/':
			          res=num1/num2;
			         System.out.println("Division of two numbers is: "+res);
			         break;
			case '%':
		              res=num1%num2;
		             System.out.println("Modulus of two numbers is: "+res);
		              break;
		     default: 
			         System.out.println("The Operation is not Valid.....");
			         break;
		}
	}

}
