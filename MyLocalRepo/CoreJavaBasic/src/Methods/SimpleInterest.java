package Methods;

public class SimpleInterest {

	public static void main(String[] args) {
		System.out.println("Calculating Simple Interest using Method Overloading.....");
		
		System.out.println(".......................................");
		
		System.out.println("Result Of Simple Interest is \t"+SimpleInterest.getSimpleInterest(3000, 6, 3));//line no 30 called
		
        System.out.println("..................................................");
        
		SimpleInterest r1= new SimpleInterest();// object create for non static method
		
		System.out.println("Result of Simple Interest is: \t"+r1.getSimpleInterest(5000, 4.5, 3));// line no 37 called
		
		System.out.println("..................................................");
		
	    SimpleInterest.getSimpleInterest(5000.25, 4, 3);//line no 44 called..... static method for void return type direct assign value
	    
		System.out.println("..................................................");
		
		SimpleInterest f1= new SimpleInterest();// object create for non static method with void return type
		
        f1.getSimpleInterest(500.45, 5.5, 10);//line no 52 called....non static method for void return type direct assign value
        
		System.out.println("..................................................");
	}
    static int getSimpleInterest(int p, int r, int t) { //static method  with return type
        int result= (p*r*t)/100;
        System.out.println("Enter the Value of Principal:\t "+p);
		System.out.println("Enter the Value of Rate:\t "+r);
		System.out.println("Enter the Value of Time:\t "+t);
        return result;
    }
     double  getSimpleInterest(long p, double r, long t) { //non static method with return value
    	double result= (p*r*t)/100;
    	System.out.println("Enter the Value of Principal:\t "+p);
		System.out.println("Enter the Value of Rate:\t "+r);
		System.out.println("Enter the Value of Time:\t "+t);
    	return result;
    }
     static void getSimpleInterest(double p, int r, long t) {// static method with void return type
    	 double result=(p*r*t)/100;
    	System.out.println("Enter the Value of Principal:\t "+p);
 		System.out.println("Enter the Value of Rate:\t "+r);
 		System.out.println("Enter the Value of Time:\t "+t);
 		System.out.println("Result of Simple Interest:\t "+result);

     }
      void getSimpleInterest(double p, double r, long t) {// non static method with void return type
    	 double result=(p*r*t)/100;
    	System.out.println("Enter the Value of Principal:\t "+p);
 		System.out.println("Enter the Value of Rate:\t "+r);
 		System.out.println("Enter the Value of Time:\t "+t);
 		System.out.println("Result of Simple Interest:\t "+result);
}
}     


