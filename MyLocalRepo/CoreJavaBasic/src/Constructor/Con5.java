package Constructor;

public class Con5 {

	int roll;
	double salary;
	Con5(int r,double s){
		roll=r;//101
		salary=s;//250045.45
	}
	void display() {
		System.out.println(roll + " " + salary);// 101    250045.45
	}
	public static void main(String args[]) {
		Con5 c1 = new Con5(101,250045.45);
		c1.display();
		Con5 c2 = new Con5(201,550045.45);		
		c2.display();
	}
}
