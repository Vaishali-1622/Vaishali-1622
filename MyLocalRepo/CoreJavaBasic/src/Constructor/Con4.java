package Constructor;

public class Con4 {

	int roll;
	double salary;

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String args[]) {
		Con4 c1 = new Con4();
		c1.display();//0    0.0
	}
}
