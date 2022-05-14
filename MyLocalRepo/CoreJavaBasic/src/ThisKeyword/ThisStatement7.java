package ThisKeyword;

public class ThisStatement7 {

	ThisStatement7(){
		System.out.println("I am zero-param");
	}
	ThisStatement7(int num){
		this(45l);
		System.out.println("I am int-param");
		System.out.println(num);
	}
	ThisStatement7(double num){
		this(25);
		System.out.println("I am double-param");
		System.out.println(num);
	}
	ThisStatement7(long num){
		this('a');
		System.out.println("I am long-param");
		System.out.println(num);
	}
	ThisStatement7(char num){
		System.out.println("I am char-param");
		System.out.println(num);
	}
	public static void main(String[] args) {
		ThisStatement7 t1=new ThisStatement7(25.6);
	}
}
//char-->long-->int-->double
