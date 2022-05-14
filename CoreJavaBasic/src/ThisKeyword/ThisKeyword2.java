package ThisKeyword;

public class ThisKeyword2 {
		int x;
		// Constructor with a parameter
		public ThisKeyword2(int x) {
			System.out.println("Local variable x: "+x);//45
			System.out.println("Global variable x: "+this.x);//0
			this.x = x;//45
			System.out.println("Local variable x: "+x);//45
			System.out.println("Global variable x: "+this.x);//45
		}
		// Call the constructor
		public static void main(String[] args) {
			ThisKeyword2 myObj = new ThisKeyword2(45);
			System.out.println("Value of x = " + myObj.x);//45
		}
	}
