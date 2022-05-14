package Independent;

public class ConVo {

	public static void main(String[] args) {
		System.out.println("Program to find Consonot or vowel number using If else...");
		getAlbhabet('i');
	}
	static void getAlbhabet(char ch) {
		System.out.println("Given Alphabet is:"+ch);
		if((ch=='a') ||(ch=='e') || (ch=='i') || (ch=='o')|| (ch=='u')) {
			System.out.println("Given Alphabet is Vowel");
		}else {
			System.out.println("Given Alphabet is Consonent");
		}
		
	}
}
