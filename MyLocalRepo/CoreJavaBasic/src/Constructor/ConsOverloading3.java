package Constructor;


	class Multiply {
		static double res=123;
		Multiply(int a){
			System.out.println("Zero-para cons.."+a);
		}
		Multiply(int s, int e){
			System.out.println("Overloading of constructor: "+s+" "+e);//not use comma in overloading only use concatination
		}
		void mul(int a, int b) {
			System.out.println("Sum of two=" + (a * b));
		}

		void mul(int a, int b, int c) {
			System.out.println("Sum of three=" + (a * b * c));
		}
		int var=345;
	}
	public class ConsOverloading3 {
		public static void main(String args[]) {
			Multiply m = new Multiply(67);//constructor call of line no 6
			m.mul(6, 10);//method call with different parameter
			m.mul(10, 6, 5);//method call
			//Multiply m1=new Multiply(234, 78);//constructor overloading call
			System.out.println("Res value:"+Multiply.res);//static variable call
			System.out.println("Res value:"+m.var);//m.res//non static variable call
		

		}
	}

	