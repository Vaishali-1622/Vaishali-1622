package Methods;

public class MethodPrac7 {

	public static void main(String[] args) {
	       simpleinterest(1500,2,12);// not required syntax b'coz static void 
	       System.out.println("Ans: "+simpleinterest1(1600,3,5));// required syntax b'coz static double ( without void) 
	       MethodPrac7 H1 = new MethodPrac7();
	       H1.simpleinterest2(1400,7,5);// not required syntax b'coz non static void 
	       MethodPrac7 H2 = new MethodPrac7();
	       System.out.println ("Ans: "+H2.simpleinterest3(1200,2,2));//required syntax b'coz non static double ( without void)
		}
	    static void simpleinterest(int p,int r, int t) {
	    	double res = p*r*t/100;
	    	System.out.println("Ans: "+res);// syntax required b'coz void are the return type for result
	    } 
	    static double simpleinterest1(int p,int r, int t) {
	    	double res = p*r*t/100;
	    	return res;
	    }
	    void simpleinterest2(int p,int r, int t) {
	    	double res = p*r*t/100;
	    	System.out.println("Ans: "+res);//// syntax required b'coz void are the return type for result
	    }
	    double simpleinterest3(int p,int r, int t) {
	    	double res = p*r*t/100;
	    	return res;
	}

}
