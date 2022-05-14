package Practice;

public class LocalGlobal {

	//global variable ---> static global variable & non-static global variable
		static int empID,age=35;
		double salary=25000;
		public static void callA() {
			System.out.println("I am callA()");
		}
		static int callC(int acc) {
			System.out.println("I am callC()");
			return acc;
		}
		void callB() {
			System.out.println("I am callB()");
		}
		public double callD(int pin) {
			System.out.println("I am callD()");
			System.out.println(pin);
			return pin;
		}
		public static void main(String[] args) {
			//nonstatic-members:salary,callB(),callD()
			LocalGlobal ref=new LocalGlobal();
			System.out.println(ref.salary);
			ref.salary=85000;
			System.out.println(ref.salary);
			ref.callB();//it will be executed, we can't write it inside println as its return type is void
			//way-1
			ref.callD(41015);//it will be executed but you won't be able to see/use its return value
			//way-2
			System.out.println(ref.callD(41015));//it will be executed and the return value will be displayed in console
			//way-3
			double rvalue=ref.callD(41015);//it will be executed and storing return value in variable for future use
			System.out.println(rvalue);
			
			LocalGlobal ref1=new LocalGlobal();
			System.out.println(ref1.salary);
			
			
			//static-members: empID,age, callA(),callC(int acc)
			System.out.println(LocalGlobal.age);//35
			System.out.println(LocalGlobal.empID);//0
			LocalGlobal.callA();//can't write this inside println as it won't return any value
			//way-1:
			LocalGlobal.callC(12345);//it will execute method but you won't be able to use/see its return value
			//way-2:
			System.out.println(LocalGlobal.callC(12345));//it will execute method and you see the return value in the console
			//way-3
			int value=LocalGlobal.callC(12345);//it will execute method and storing return value in variable for future use
			System.out.println(value);		
			//local variable
			int age;
			age=25;//int age=25;
			System.out.println("Local variable: "+age);
		}

	}
	/**
	 * local/global delcare & initilize a variable: datatype variablename = value;
	 * 				//or
	 * local/global variable declaration: datatype variablename;
	 * local/global variable initilize:   variablename = value;
	 * 
	 * member---> variable & method
	 * static member: static variable & static method   ----->to access use classname or access them directly from another static method
	 * non-static member: non-static variable & non-static method ---> to access use instance--> create an instance/object of the required class
	 * 								classname ref;  //no object created
	 * 								new classname();//object created
	 * 						classname ref;
	 * 						ref = new classname();
	 * 								//or
	 * 						classname ref = new classname(); 
	 */
