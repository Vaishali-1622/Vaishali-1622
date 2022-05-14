package FinalKeyword;

public class FinalKeyword4 {

	final int speedlimit;// blank final variable
	FinalKeyword4() {
		speedlimit = 70;
		System.out.println(speedlimit);//70
	}
	public static void main(String args[]) {
		FinalKeyword4 f1=new FinalKeyword4();
		System.out.println(f1.speedlimit); //70
	}
}