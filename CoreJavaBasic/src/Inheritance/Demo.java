package Inheritance;

//parent class
class fruit1 {
	fruit1(){
		System.out.println("fruit class cons..");
	}
	 protected void taste() {
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class apple1 extends fruit1 {
	apple1(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void taste() {
		System.out.println("Apple is round");
	}
}
public class Demo {
	public static void main(String[] args) {
		apple fr = new apple(); // object of child class
		fr.taste(); // call method of parent class
		//fr.shape(); // call method of child class
	}
}