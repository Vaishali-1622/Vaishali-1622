package Practice;

class Student{
	int age=56;
	public static double getId(double Id) {
		return Id;
	}
	public static int getId(int Id) {
		return Id;
	}
    double getpass(double pass) {
		return pass;
	}
	int getpass(int pass) {
		return pass;
	}

	Student(int y){
		System.out.println("Constructor of Parent: "+y);
	}
	Student(double x){
		this(11);
		System.out.println("Constructor of Parent: "+x);
		System.out.println("Constructor of Parent using this keyword: "+this.age);

	}
	public double getTriangle() {
		int b=5,h=10,area;
		area=1/2*b*h;
		return area;
	}
	public double getCircle() {
		double r=20,area;
		area=3.14*r*r;
		return area;
	}
	public double getSimpleInterest() {
		double p=1200, r=2, t=3, result;
		result= (p*r*t)/100;
		return result;
	}
}

class Subject extends Student{
	public static double getId(double Id) {
		return Id;
	}
	public static int getId(int Id) {
		return Id;
	}
	double getpass(double pass) {
		return pass;
	}
	int getpass(int pass) {
		return pass;
	}
	Subject(){
		super(78);
		System.out.println("Constructor of Child: ");
	}
	Subject(double x){
		super(67.9);
		System.out.println("Constructor of Child: "+x);
		System.out.println("Constructor of Child using super keyword: "+super.age);

	}

	public double getTriangle() {
		int b=10,h=10,area;
		area=1/2*b*h;
		return area;
	}
	public double getCircle() {
		double r=10,area;
		area=3.14*r*r;
		return area;
	}
	public double getSimpleInterest() {
		double p=200, r=2, t=3, result;
		result= (p*r*t)/100;
		return result;
	}
	
}

public class MockGroup {
	  int age;
	double salary=56700;

	public static void main(String[] args) {
		System.out.println("Overloading of Static and Non static Method In Parent And Child Class");
		System.out.println("Access of static method of parent: "+Student.getId(12));
		System.out.println("Access of static method of child: "+Subject.getId(8.5));
		Student f1=new Student(16);
		f1.getCircle();
		Subject s1=new Subject();
		s1.getpass(39.8);
		s1.getTriangle();
		Subject s2=new Subject(34.5);
		s2.getpass(13);
		s2.getTriangle();
		



	}

}
