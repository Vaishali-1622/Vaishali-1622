package ThisKeyword;

public class ThisStatement3 {

	ThisStatement3()
	{
		this('c',25.36);
		System.out.println("******Zero-Param*********");
	}
	ThisStatement3(int age)
	{
		System.out.println("******int-Param*********");
	}
	ThisStatement3(char c, double d)
	{
		this(25);
		System.out.println("******char-double-param*********");
	}
	public static void main(String[] args) {
		
		ThisStatement3 t1=new ThisStatement3();
	}
}

/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside ths constuctor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 * 
 */