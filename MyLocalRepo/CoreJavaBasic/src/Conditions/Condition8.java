package Conditions;

public class Condition8 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
				int age = 17;
				int weight = 51;
				// applying condition on age and weight
				if (age >= 18) {
					System.out.println("Condidate age is: " +age);//f
					if (weight > 50) {
						System.out.println("You are eligible to donate blood");//f
					} else {
						System.out.println("You are not eligible to donate blood");//f
					}
				} else {
					System.out.println("Age must be greater than 18");//t
				}
			}
		}