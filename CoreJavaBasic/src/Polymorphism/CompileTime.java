package Polymorphism;

public class CompileTime {
     void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}
	 void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three numbers :" + c);
	}
	public static void main(String[] args) {
		CompileTime c1=new CompileTime();
		c1.sum(45, 80, 22);
		//CompileTime.sum(45, 80, 22);// for static method
	}
}
/**
 * When a method gets to know its implementation at the time of compilation is known as compile
 * time poly this can be achieved by using static method overloading...
 * can be done for both static n non static method
 */
