package Practice;

public class MockGroup2 {
	static void A(){
		
		System.out.println("***** Static A******");
	}
	 static void B(){
		A();
		System.out.println("***** Static B******");
	}
	 void C(){
		 
		 D();
		System.out.println("*****Non static C******");
	}
	 void D(){
		
		System.out.println("*****Non static D******");
	}
     static void E(){
		 
		
		System.out.println("*****Non Static with Non Static E******");
	}
	 void F(){
		E();
		System.out.println("*****Non Static with Non Static F******");
	}
	 void G(){
		    
			System.out.println("***** Static with Non Static G******");
			
		}
	static void H(){
			System.out.println("*****Static with Non Static H******");
			MockGroup2 v1=new MockGroup2();
			v1.G();
		}
	public static void main(String[] args) {
		B();
		MockGroup2 f1=new MockGroup2();
		f1.C();
		f1.F();
		H();
	}

}
