package ArrayAssignment;

public class Arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Practice question 8
		System.out.println("********Rotate Array**********");
		int array[] = { 1, 2, 3, 4, 5, 6 };
		int temp;
		int l = array.length;
		int n = Math.floorDiv(l, 2);
		for (int i = 0; i < n; i++) {
			temp = array[i];
			array[i] = array[l - i - 1];
			array[l - i - 1] = temp;
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
		// Practice question 9
		System.out.println("\n********largest number in Array**********");
		int marry[] = { 12, 34, 56, 47, 16 };
		int max = 0;
		for (int i : marry) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("largest no. is : " + max);
	}
}