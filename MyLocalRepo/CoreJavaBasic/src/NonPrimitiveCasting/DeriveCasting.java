package NonPrimitiveCasting;

public class DeriveCasting {

	public static void main(String[] args) {
		pen a1 = new pencil();// up Casting -> parent to child
		//pen a3= (pen) new pencil();
		a1.penname();
		pencil a2 = (pencil)a1;//down casting -> child to parent
		a2.pencilname();
		a2.penname();
		bothstuff(a2);
	}
	static void bothstuff(pen a2) { // implicit upCating pen a2 -> new pencil-> pen a1 = (pen)new pencil();
		a2.penname();
		pencil a3 = (pencil)a2;// Down Casting -> child to parent
		a3.pencilname();
	}
}

//parent class
class pen{
	void penname () {
		System.out.println(" Rorito");
	}
}
// child class
class pencil extends pen{
	//overridden
	void penname () {
		System.out.println(" cello ");
	}
	void pencilname () {
		System.out.println(" Natraj");
	}
}