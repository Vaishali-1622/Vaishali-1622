package Methods;

 public class Adder {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	static void call() {
		System.out.println("I am call() of Adder class");
	}
}
    class MethodOver {
	static void call() {
		System.out.println("I am call() of MethodOver class");
	}
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
		Adder.call();
		//call();
		//or
		MethodOver.call();
	}
}
