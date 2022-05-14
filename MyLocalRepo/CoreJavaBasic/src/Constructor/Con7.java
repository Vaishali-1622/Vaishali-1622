package Constructor;

class C {
	double i = 10.23;
	C(double j) {
		System.out.println("Running Class C constructor..");
		i = j;
	}
}

public class Con7 {

	public static void main(String args[]) {
		System.out.println("Main() of Class Con7 is started...");
		C b1 = new C(15);
		System.out.println("Class C global varibale i = " + b1.i);// 15.0
		System.out.println("======================================");
		C b2 = new C(0.32);
		System.out.println("Class C global varibale i = " + b2.i);//0.32
		System.out.println("Main() of Class Con7 is ends here...");
	}
}
