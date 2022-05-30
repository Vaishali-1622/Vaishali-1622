package Mock;

public class Demo {

	public static void main(String[] args) {
				getReverse();

		}
			public static void getReverse(){
			String s1="Vaishali";
			String reverseStr="";
			System.out.println("Enter the string value:"+s1);

			for(int i=s1.length()-1;i>=0;i--){
				reverseStr=reverseStr+s1.charAt(i);
		}
			System.out.println(reverseStr);
		}

}


