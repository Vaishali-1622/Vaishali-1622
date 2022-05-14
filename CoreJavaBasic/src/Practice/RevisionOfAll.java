package Practice;

class Fresh{
	static int getValue(int x) {
		System.out.println(" Value will be present:"+x);
		return x;
	}
	static double getValue(double y) {
		getValue(2);
		System.out.println(" Value will be present:"+y);
		return y;
	}
	void getDisplay() {
		System.out.println(" Result ");

	}
}

class Mind extends Fresh{
	int getNum(int x) {
		getNum(3.4);
		System.out.println(" Value will be present:"+x);
		return x;
	}
	double getNum(double y) {
		System.out.println(" Value will be present:"+y);
		return y;
	}
	void getDisplay() {
		System.out.println(" Result should be Displayed ");

	}
}

public class RevisionOfAll {

	public static void main(String[] args) {
		Fresh f1= new Mind();//implicit upcasting
		Fresh f2=f1;//implicit upcasting
		Fresh f3= (Fresh)f1;//explicit upcasting
		Fresh f4= (Fresh) new Mind();//explicit upcasting
		Fresh.getValue(5.6);//static
		f1.getDisplay();//non static
		Mind m1= (Mind)f1;// downcasting
		m1.getNum(12);//non static
		m1.getDisplay();//non static
		Fresh.getValue(8.8);//static
		RevisionOfAll rrr= new RevisionOfAll();
		rrr.getName(f2);

	}
	void getName(Fresh f6) {//upcasting in method
		Mind f7=(Mind)f6;// downcasting in method
		//f7.getDisplay();
		//f7.getNum(1.1);

	}
}
