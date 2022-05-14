package Blocks;

public class Block3 {

	/* non-static block or IIB */
	{
		System.out.println("running non-static-block1 of class Blocks3..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Block3 b1 = new Block3();
		System.out.println("---------------------------------");
		Block3 b2 = new Block3();
		System.out.println("main() ends");
	}
}