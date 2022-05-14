package FinalKeyword;

public class FinalKeyword3 {

	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}

	public static void main(String args[]) {
		FinalKeyword3 obj = new FinalKeyword3();
	    obj.run();
		System.out.println(obj.salary);
	}
}