package ThisKeyword;

public class ThisStatement {

	ThisStatement()
	{
		System.out.println("******Zero-Param*********");
	}
	ThisStatement(int age)
	{
		System.out.println("******int-Param*********");
	}
	ThisStatement(char c, double d)
	{
		System.out.println("******char-double-Param*********");
	}
	void display(){
		System.out.println("******Executed*********");

	}
	public static void main(String[] args) {
		
		ThisStatement t1=new ThisStatement();
		t1.display();
		ThisStatement t2=new ThisStatement(25);
		t2.display();
		ThisStatement t3=new ThisStatement('c',25.36);
		t3.display();
	}
}

/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside the constructor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 */
