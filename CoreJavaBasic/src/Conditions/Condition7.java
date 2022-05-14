package Conditions;

public class Condition7 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
				int age = 18;
				int weight = 51;
				// applying condition on age and weight
				if (age >= 18) {
					if (weight > 50) {
						System.out.println("You are eligible to donate blood");//t
					} else {
						System.out.println("You are not eligible to donate blood, as you weight is below 50");//f
					}
				}else {
					System.out.println("You are not eligible to donate blood, as you age is below 18");//f
				}
			}
		}

