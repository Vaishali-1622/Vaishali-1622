package Variables;

public class VariablePrac2 {

		static char grade='A';//Static Global Variable
		static int enrollno=909, ID=12345;//Static global variable
		double payment=45000;//Non static global variable
		
		public static void main(String[] args) {
			System.out.println("Example of Global and Local Variables..... \nDetails of the Student:");
			int age=25, ID=4568;//local variable
			System.out.println("Id of the Student: "+VariablePrac1.ID);//12345
			System.out.println("Age of the Student: "+age);//25
			System.out.println("Enrollno of the Student: "+enrollno);//909
			System.out.println("Local ID of the Student: "+ID);//4568
			System.out.println("Overall Grade of the Student: "+grade);//A
			VariablePrac2 p1 = new VariablePrac2();//object created
			p1.payment=12000;
			System.out.println("Payment of the Student: "+p1.payment);//12000
			VariablePrac2.ID=8888;
			System.out.println("Updated Id of the Student: "+VariablePrac2.ID);//8888
			System.out.println("Thank you for your Visit........");
	}

}
