package ArrayAssignment;

import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {
		// Practice Question 1
		int A[] = { 1, 3, 4, 6, 7, 9 };
		for (int i : A) {
			System.out.print(" " + i);
		}
		System.out.println("\nlength of array: " + A.length);

		System.out.println("******************");
		// copy array A element in Array B
		int B[] = A.clone();
		for (int j : B) {
			System.out.print(" " + j);
		}
		System.out.println("\nlength of array: " + A.length);

		System.out.println("******************");
		// Practice Question 2
		int C[] = { 1, 2, 6, 7, 1, 8, 4 };
		double sum = 0;
		for (int num : C) {
			sum = sum + num;
		}
		System.out.println("sum of all number of array: " + sum);

		System.out.println("******************");
		// Practice Question 3
		int D[] = { 12, 14, 25, 4, 34, 7 };
		int min = D[0];
		int max = D[0];
		for (int i = 0; i < D.length; i++) {// normal for loop
			if (min > D[i]) {
				min = D[i];
			}
			if (max < D[i]) {
				max = D[i];
			}
		}
		System.out.println("smallest no. is: " + min);
		System.out.println("largest  no. is: " + max);

		// Practice Question 4
		System.out.println("******************");
		// odd position and even position
		int E[] = { 12, 34, 54, 58, 44 };
		for (int i = 0; i < E.length; i++) {
			if (i % 2 != 0) {
				System.out.println("odd position num :" + E[i]);
			}
			if (i % 2 == 0) {
				System.out.println("even position num:" + E[i]);
			}
		}

		// Practice Question 5
		System.out.println("*****array in Asending order******");
		int F[] = { 25, 24, 57, 56, 53, 41 };
		Arrays.sort(F);
		for (int h : F) {
			System.out.print(" " + h);
		}
	}
}
