package Methods;

public class TotalRecall {
			static int rollno=22;//global variable
		    double salary=45000;//global variable
			
			public static void main(String[] args) {
				char grade='A';//local variable
				System.out.println("Roll Number of the candidate: \t"+rollno);//directly access global variable
				
				TotalRecall sal= new TotalRecall();//object created for non static global variable
				
				System.out.println("Roll Number of the candidate: \t"+sal.salary);//standard way to access non static global variable
				
				System.out.println("Grade of the Candidate: \t"+grade);//local variable access
				
				System.out.println("----------------------------------------------------------------");
				
				System.out.println("Calculating Area of Rectangle using Static/Non Static method and Method Overloading.....");
				
				System.out.println(".......................................");
				
				System.out.println("Area of Rectangle:       \t"+TotalRecall.rectangle(15, 30));//line no 43 called
				
				System.out.println("..................................................");
				
				TotalRecall rec= new TotalRecall();// object create for non static method
				
				System.out.println("Area of Rectangle:       \t"+rec.rectangle(20, 12.5));// line no 49 called
				
				System.out.println("..................................................");
				
				TotalRecall.rectangle(25.5, 20);//line no 55 called..... static method for void return type direct assign value
				
				System.out.println("..................................................");
				
				TotalRecall rec1= new TotalRecall();// object create for non static method with void return type
				
				rec1.rectangle(5.5, 14.2);//line no 62 called....non static method for void return type direct assign value
				
				System.out.println("..................................................");
	}
    static int rectangle(int l, int b) { //static method  with return type
        int area= l*b;
        System.out.println("Enter the Value of Length: \t"+l);
		System.out.println("Enter the Value of Breath: \t"+b);
        return area;
    }
     double  rectangle(long l, double b) { //non static method with return value
    	double area= l*b;
    	System.out.println("Enter the Value of Length: \t"+l);
		System.out.println("Enter the Value of Breath: \t"+b);
    	return area;
    }
     static void rectangle(double l, int b) {// static method with void return type
    	 double area= l*b;
    	System.out.println("Enter the Value of Length: \t"+l);
 		System.out.println("Enter the Value of Breath: \t"+b);
 		System.out.println("Area of Rectangle:         \t "+area);

     }
      void rectangle(double l, double b) {// static method with void return type
    	 double area= l*b;
    	System.out.println("Enter the Value of Length: \t"+l);
  		System.out.println("Enter the Value of Breath: \t"+b);
  		System.out.println("Area of Rectangle:         \t"+area);

}
}     


