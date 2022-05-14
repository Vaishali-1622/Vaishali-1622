package Inheritance;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// we can use any object of following to call non static member of child class
           subclass A1 = new subclass(856);
           subclass A2 = new subclass(255.0);
           A1.areaofTriangle(17, 18);
           A1.areaofCircle(18);
           A2.getsimpleinterest(1600, 7, 6);
           A2.getsimpleinterest(1800.50, 4, 7);
	}

} // parent Class
class superclass{
	// Constructor overloading
	superclass(int Rollno){
		System.out.println("my Roll Number is: "+Rollno);//156	
	}
	superclass(double Rollno){
		System.out.println("my Roll Number is: "+Rollno);//226.0	
	}
	
	void areaofTriangle(int l ,int b) {
		double res = l*b/2;
		System.out.println("Area of triangle: "+res);//96
	}
	void areaofCircle(double r) {
		double res = 22/7*Math.pow(r,2);
		System.out.println("Area of Circle: "+res);//675
	}
	// method Overloading
	static void simpleInterest(int p ,int t , int r) {
		double res = p*r*t/100;
		System.out.println("SimpleInterest is : "+res);//120
	}
	static void simpleInterest(double p ,int t , int r) {
		double res = p*r*t/100;
		System.out.println("SimpleInterest is : "+res);//240
	}
} // child class
class subclass extends superclass{
	subclass(int myId){
		super(156);
		System.out.println("my Exam ID: "+myId);//856
	}
	subclass(double myId){
		super(226.0);
		System.out.println("my Exam ID: "+myId);//255.0
	}
	// method Overriding
	void areaofTriangle(int l ,int b) {
		super.areaofTriangle(12,16);
		double res = l*b/2;
		System.out.println("Area of triangle child class: "+res);//153
	}
	void areaofCircle(double r) {
		super.areaofCircle(15);
		double res = 22/7*Math.pow(r,2);
		System.out.println("Area of Circle child class: "+res);//972
	}
	// method Overloading
	 double getsimpleinterest(int p ,int t , int r) {
	    super.simpleInterest(1200, 2, 5);
		double res = p*r*t/100;
		System.out.println("SimpleInterest is child class : "+res);//672
		return res;
	}
	double getsimpleinterest(double p ,int t , int r) {
		super.simpleInterest(1200.0, 4, 5);
		double res = p*r*t/100;
		System.out.println("SimpleInterest is child class : "+res);//504
		return res;
   }
}
//note :-
//super keyword not use in static member. 
// but we can assign value to static method by using "super"keyword from non static method

