package Independent;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("ArmStrong Number........");
		getArmstrong(153);
	}

	public static void getArmstrong(int num) {
		System.out.println("Number is:" + num);
		int realnum = num, res = num, length = 0;
		double sum = 0;
		while (realnum != 0) {
			realnum /= 10;
			length = length + 1;

		}
		while (res != 0) {
			double rem = res % 10;
			sum = sum + Math.pow(rem, length);
			res = res / 10;
		}
		System.out.println("Sum is:" + sum);
		if (num == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is Not Armstrong");

		}
	}
}
//Armstrong
//	static void ArmstrongNo(int num) {
//		int rem,temp,temp1,power=0;
//		double sum=0;
//		temp = num;
//		temp1=num;
//		while(temp1!=0) {
//			temp1 = temp1/10;
//			power++;
//		}while(temp!=0) {
//			rem = temp%10;
//			sum = sum + Math.pow(rem, power);
//			temp = temp/10;
//		}if(num==sum) {
//			System.out.println("number is ArmsStrong: "+sum);
//		}else {
//			System.out.println("number is not ArmsStrong: "+sum);
//		}
