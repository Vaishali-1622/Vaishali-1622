package Conditions;

public class Condition1 {

	public static void main(String[] args) {
		int num1=85, num2=60;
		
		if(!(num1==num2)) {
			System.out.println("Number1 is greater than numbers2");//true
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}
		
		if(num1>num2) {
			System.out.println("Number1 is greater than numbers2");//true
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}
		
		if(num1>=num2 ) {
			System.out.println("Number1 is either equals to number2 or greater than numbers2");//true
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}
		
		if(num1==num2 || num1>num2) {
			System.out.println("Number1 is either equals to number2 or greater than numbers2");//true
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}
		
		if(num1>=num2 && num1>num2) {
			System.out.println("Number1 is either equals to number2 or greater than numbers2");//true
		}else {
			System.out.println("Number1 is smaller than numbers2");
		}
		//num1=85 , num2=30
		if(num1==num2) {
			System.out.println("Number1 is equals to number2");//false
		}else if(num1<num2) {
			System.out.println("Number1 is greater than numbers2");//false
		}else {
			System.out.println("Number1 is smaller than number2");//true
		}
		
		int sub1=50,sub2=30;
		if(sub1>35 && sub2>35) {
			System.out.println("pass....");
		}else {
			System.out.println("fail....");//fail
		}
	}
}