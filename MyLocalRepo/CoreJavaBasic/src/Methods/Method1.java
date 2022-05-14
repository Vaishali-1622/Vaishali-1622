package Methods;

public class Method1 {

	/*
	 * accessmodifier: private
	 * non-accessmodifier: static
	 * return type: int
	 * methodName: getEmpName
	 * argument/parameter: int
	 * return value: int 
	 */
	 static int getEmpName(int id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier: public
	 * non-accessmodifier: static
	 * return type: int
	 * methodName: getEmpContatct
	 * argument/parameter: short
	 * return value: short id
	 */
	public static int getEmpContact(short id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier: default
	 * non-accessmodifier: static
	 * return type: double
	 * methodName: getEmpPin
	 * argument/parameter: long
	 * return value: long id
	 */
	static protected double getEmpPin(long id) {
		//statements
		return id;
	}
	/*
	 * accessmodifier: default
	 * non-accessmodifier: static
	 * return type: int
	 * methodName: getEmpAccount
	 * argument/parameter:  
	 * return value: int
	 */
	static int getEmpAccount() {
		//statement
		return 25;
	}
	/*
	 * accessmodifier: public
	 * non-accessmodifier: static
	 * return type: void
	 * methodName: main
	 * argument/parameter: String args
	 * return value:
	 */
	public static void main(String[] args) {
		
		//return;//by default written by java compiler at the time of compilation
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	void addTwoNumbers() {
		int num1=25,num2=50,res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
	}
	/*
	 * accessmodifier:
	 * non-accessmodifier:
	 * return type:
	 * methodName:
	 * argument/parameter: 
	 * return value:
	 */
	 double addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		System.out.println("Res: "+res);
		return res;
	}
}
