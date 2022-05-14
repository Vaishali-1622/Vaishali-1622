package Array;

public class Array3 {

	public static void main(String[] args) {
//		int a1[]=new int[5];//array declaration and initialization
//		a1[0]=12;//value assign to array
//		a1[1]=1;
//		a1[2]=6;
//		a1[3]=10;
//		a1[4]=89;
//		for(int i:a1) {
//			System.out.println("Output is:"+i);
//		}
		int b1[] = { 15, 34, 67, 9, 3, 9 };
		System.out.println("Length is:" + b1.length);

		for (int i : b1) {
			int count = 0;
			for (int j : b1) {
				if (i == j) {
					count++;
					if(count>1) {
						j=0;
					}
				}
				
			}
			System.out.println("The Number is:" + i + " Frequency is:" + count);
			//System.out.println("The Number is:" + b1[2]);

		}
		for (int i : b1) {
			System.out.println("Output is:"+i);
		}

	}

}
