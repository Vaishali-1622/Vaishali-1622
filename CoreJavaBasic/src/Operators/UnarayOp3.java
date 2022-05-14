package Operators;

public class UnarayOp3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a; 
		//b= 0 + 2 + 3 + 3
		System.out.println("a: "+a);//3
		System.out.println("b: "+b);//8
		System.out.println("**********************");
		a = 0;
		b = a-- + --a + --a + a;
		//b= 0 + -2 + -3 + -3
		System.out.println("a: "+a);// -3
		System.out.println("b: "+b);// -8
		System.out.println("**********************");

		a = 0;
		b = --a + --a + --a + a + ++a + a++;
		//b= -1 + -2 + -3 + -3 + -2 + -2
		System.out.println(a);//-1
		System.out.println(b);// -13
		System.out.println("**********************");

		a = 0;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		//b= 0 + -1 + 0 + 0 + 2 + 2 + 3
		System.out.println(a);//3
		System.out.println(b);// 6
		System.out.println("**********************");

	}

}
