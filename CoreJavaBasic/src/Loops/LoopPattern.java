package Loops;

public class LoopPattern {

	public static void main(String[] args) {
		System.out.println("..........Number Pattern 1..........\n ");
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		System.out.println("\n..........Number Pattern 2 ..........\n ");
		for(int i=1;i<=10;i++) {
			for(int j=i;j<=10;j++) {
			System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		System.out.println("\n..........Number Pattern 3 ..........\n ");
		for(int i=1;i<=10;i++) {
			for(int j=i;j<=10;j++) {
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
			System.out.println(" ");
	}
		
	}
}
