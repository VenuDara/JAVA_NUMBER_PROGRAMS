package NumberPrograms;

import java.util.Scanner;

public class strongNumber {
	
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	
	
	public static boolean isStrong(int num) {
		int OriginalNum = num;
		int sum = 0;
		while(num!=0) {
			int digit=num%10;
			sum+=factorial(digit);
			num/=10;
		}
		return OriginalNum==sum;
		
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = s.nextInt();
		if(isStrong(num)) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
		s.close();

	}

}
