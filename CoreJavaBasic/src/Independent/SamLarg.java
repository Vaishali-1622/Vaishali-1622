package Independent;

public class SamLarg {

	public static void main(String[] args) {
		System.out.println("Find out the Smallest And Largest Number........\n");
		getLargest(112, 199, 167, 1123);
	}

	static void getLargest(int num1, int num2, int num3, int num4) {
		System.out.println("List of numbers are:" + num1 + "," + num2 + "," + num3 + "," + num4 + ",");
		if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
			System.out.println("Number First is Largest:" + num1);
		} else if ((num2 > num1) && (num2 > num3) && (num2 > num4)) {
			System.out.println("Number Second is Largest:" + num2);
		} else if ((num3 > num1) && (num3 > num2) && (num3 > num4)) {
			System.out.println("Number Third is Largest:" + num3);
		} else {
			System.out.println("Number Fourth is Largest:" + num4);
		}
		System.out.println("*****************************************");
		SamLarg.getSmallest(56, 89, 112, 131);

	}

	static void getSmallest(int num1, int num2, int num3, int num4) {
		System.out.println("List of numbers are:" + num1 + "," + num2 + "," + num3 + "," + num4 + ",");
		if ((num1 < num2) && (num1 < num3) && (num1 < num4)) {
			System.out.println("Number First is Smallest:" + num1);
		} else if ((num2 < num1) && (num2 < num3) && (num2 < num4)) {
			System.out.println("Number Second is Smallest:" + num2);
		} else if ((num3 < num1) && (num3 < num2) && (num3 < num4)) {
			System.out.println("Number Third is Smallest:" + num3);
		} else {
			System.out.println("Number Fourth is Smallest:" + num4);
		}

	}
}
