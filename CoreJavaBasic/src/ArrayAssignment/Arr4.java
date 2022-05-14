package ArrayAssignment;

import java.util.Arrays;

public class Arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Practice question 6
		// frequency of array
		int S[] = { 1, 2, 4, 5, 1, 1, 8, 4 };
		int count1 = 0, num = 0;
		for (int i : S) {
			int count = 0;
			for (int j : S) {
				if (j == i) {
					count++;
				}
				if (count1 < count) {
					count1 = count;
					num = i;
				}
			}
			System.out.println("frequency of element in array: " + i + " \ncount " + count);
		}
		System.out.println("***********");
		System.out.println(" number : " + num + "\nmaximum frequency of element: " + count1);

		// Practice question 7
		System.out.println("********************************");
		// smallest digit and largest digit can find out
		int Z[] = { 4, 8, 6, 5, 2 };
		Arrays.sort(Z);
		System.out.println("smallest number: " + Z[1]);
		System.out.println("largest number : " + Z[4]);// we know length
		System.out.println("largest  number: " + Z[Z.length - 1]);// we not know the length
		System.out.println("2nd largest  number: " + Z[Z.length - 2]);// 2nd largest
	}
}
