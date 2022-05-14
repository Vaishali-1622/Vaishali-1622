package ThisKeyword;

public class ThisStatement2 {

		ThisStatement2()
		{
			System.out.println("******Zero-Param*********");
		}
		ThisStatement2(int age)
		{
			this();
			System.out.println("******int-Param*********");
		}
		ThisStatement2(char c, double d)
		{
			this(25);
			System.out.println("******char-double-Param*********");
		}
		public static void main(String[] args) {
			ThisStatement2 t3=new ThisStatement2('c',25.36);
		}
	}

	/**
	 * this()--> 
	 * 			this statement is an instance of current class which is declared inside ths constuctor body 
	 * 			its should be first statement inside the constructor body
	 * 			its used to call another constructor of the same class based on parameter. 
	 * 
	 */
