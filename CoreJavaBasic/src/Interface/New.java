package Interface;

  class A{
		public void love() {
			System.out.println("i love India");
		}

 }
final class B extends A{// it can be inherited
	public void love() {
		System.out.println("i love India too");
	}

}
public class New {

	public static void main(String[] args) {
		B obj=new B();
		obj.love();
		//A ob=new A();
		//ob.love();
	}

}
