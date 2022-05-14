package Conditions;

public class Condition5 {

	public static void main(String[] args) {
		int marks=50; 
		if(marks<50){
			System.out.println("fail");  //f
		}        				
		else if(marks>=50 && marks<60){  
			System.out.println("D grade");  //t
		}  
		else if(marks>=60 && marks<70){  
			System.out.println("C grade");//f  
		}  
		else if(marks>=70 && marks<80){  
			System.out.println("B grade");  //f
		}  						
		else if(marks>=80 && marks<90){  
			System.out.println("A grade");  //f
		}else if(marks>=90 && marks<100){  
			System.out.println("A+ grade");  //f
		}else{  
			System.out.println("Invalid!"); //f 
		}  
	}  
}  