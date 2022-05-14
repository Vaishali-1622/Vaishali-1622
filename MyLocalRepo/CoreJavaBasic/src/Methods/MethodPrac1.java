package Methods;

public class MethodPrac1 {
	
	   public int addInteger(int a, int b) {  //method create
		int result= a+b;// non static
		return result; //return value
	
	}
	public static void main(String[] args) {
		int int1= 100, int2=30;
		MethodPrac1 a1= new MethodPrac1();//object created for accesing non static variable
		int result=a1.addInteger(int1, int2);
		System.out.println("First Integer Number: "+int1);
		System.out.println("Second Integer Number: "+int2);
		System.out.println("Addition Of Two Integers are: "+result);

	}

}
