package Loops;

public class ForLoopPrac1 {

	public static void main(String[] args) {
		System.out.println("*************Printing Starts*************\n");
		for(int i=0;i<=15;i++) {
			for(int j=i;j<15;j++) {
			System.out.print("*");
			}
			System.out.println("  ");
		}
		System.out.println("*************Printing Starts*************\n");
		for(int i=15;i>=0;i--) {
			for(int j=i;j>15;j++) {
			System.out.print(" * ");
			}
			System.out.print("  ");
		}
			
			}
}
