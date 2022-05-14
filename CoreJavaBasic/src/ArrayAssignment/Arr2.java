package ArrayAssignment;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Practice question 11
		System.out.println("********Addition*********");
		// addition two matrix
		int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int mat2[][] = { { 7, 8, 9 }, { 7, 4, 1 } };
		int result[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				result[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(result[i][j] + "   ");
			}
			System.out.println(" ");
		}
		System.out.println("******Multuplication******");
		// multiply two matrix
		int mat3[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int mat4[][] = { { 7, 8, 9 }, { 7, 4, 1 } };
		int result1[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3[i].length; j++) {
				result1[i][j] = mat3[i][j] * mat4[i][j];
				System.out.print(result1[i][j] + "   ");
			}
			System.out.println(" ");
		}
		System.out.println("*******Subtraction********");
		// subtract two matrix
		int mat5[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int mat6[][] = { { 7, 8, 9 }, { 7, 4, 1 } };
		int result2[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
		for (int i = 0; i < mat5.length; i++) {
			for (int j = 0; j < mat5[i].length; j++) {
				result2[i][j] = mat5[i][j] - mat6[i][j];
				System.out.print(result2[i][j] + "   ");
			}
			System.out.println(" ");
		}
		System.out.println("*******Division*******");
		// Division of two matrix
		int mat7[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int mat8[][] = { { 7, 8, 9 }, { 7, 4, 1 } };
		int result3[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
		for (int i = 0; i < mat7.length; i++) {
			for (int j = 0; j < mat7[i].length; j++) {
				result3[i][j] = mat7[i][j] / mat8[i][j];// use % to get remainder
				System.out.print(result3[i][j] + "   ");
			}
			System.out.println(" ");
		}
	}
}
