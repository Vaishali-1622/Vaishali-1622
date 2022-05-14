package ThisKeyword;

class Student1 {
	//Global Var
	int rollno;	
	float fee;
	Student1(int rollno, float fee) {
		System.out.println("local rollno : "+rollno);//101	102
		System.out.println("local fee : "+fee);//5000.0		6000.0
		System.out.println("intial global rollno : "+this.rollno);//refers non-static global variable//0
		System.out.println("intial global fee : "+this.fee);//refers non-static global variable//0.0
	//  Global Var = Local Var;
		this.rollno = rollno;	  
		this.fee = fee;
		System.out.println("after update, global rollno : "+this.rollno);//101		102
		System.out.println("after update, intialglobal fee : "+this.fee);//5000.0	6000.0
	}
	void display() {
		System.out.println(rollno + " "+ fee);//101 5000.0   
	}
}
class ThisKeyword7 {
	public static void main(String args[]) {
		Student1 s1 = new Student1(101, 5000f);
		s1.display();
		Student1 s2 = new Student1(102, 6000f);		
		s2.display();
	}
}
