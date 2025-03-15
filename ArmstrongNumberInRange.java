package NumberPrograms;

import java.util.Scanner;

public class ArmstrongNumberInRange {
	//To count the number of digits
	public static int countOfNum(int num) {
		int count=0;
		while(num>0) {
			int digit=num%10;
			count++;
			num/=10;
		}
		return count;
	}
	
	//To Check if the number is ArmStrong or not
	public static boolean isArmStrong(int num) {
		
		int n = countOfNum(num);
		int originalNumber=num;
		int sum =0;
		while(num!=0) {
			int digit =num%10;
			sum+=Math.pow(digit, n);
			num/=10;
		}
		return originalNumber==sum;
	}
	
	//To Execute the program using scanner class
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = s.nextInt();
		System.out.println("Enter Last Number");
		int last=s.nextInt();
		for(int i=first;i<=last;i++) {
		if(isArmStrong(i)) {
			System.out.println(i+" is ArmStrong");
		}
		}
		s.close();
}
}