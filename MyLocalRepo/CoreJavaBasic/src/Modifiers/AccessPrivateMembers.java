package Modifiers;
 class AccessPrivateMembers {

	private int accNum=12345;
	private void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		AccessPrivateMembers p1=new AccessPrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
