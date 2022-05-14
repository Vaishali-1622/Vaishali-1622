package Practice;

public class FactorPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * num=15
		 * 
		 * loop-->i=1 to i<= num num%i==0 println(i)
		 */
		factor(60);
		factor(-60);
	}

	static void factor(int num) {
		if (num > 0) {
			for (int i = 0; i <= num; ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		} else {
			for (int i = num; i <= Math.abs(num); ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		}
		System.out.println();
	}
}
