package AssignmentPrograms;

public class Assignmentforloop11 {

	public static void main(String[] args) {
		System.out.println("............Printing numbers and star........\n");

		printStar();
		//printStar1();
		//revprintStar();
	}
	static void printStar() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void printStar1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void revprintStar() {
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
