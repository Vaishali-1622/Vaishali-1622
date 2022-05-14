package Constructor;

class B {
	int i = 10;

	B() {
		System.out.println("Running Class B constructor..");
		i = 23;//if i is not innitialise then the vale of global variable is declared that taken... otherwise
		//otherwise it will go toh the constructor class n execute that value
	}
}
public class Con8 {

	public static void main(String args[]) {
		System.out.println("Main() of Class Con8 is started...");
		B b1 = new B();
		System.out.println("Class B global varibale i = " + b1.i);//23
		System.out.println("======================================");
		B b2 = new B();
		System.out.println("Class B global varibale i = " + b2.i);//23
		System.out.println("Main() of Class Con8 is ends here...");
	}
}
