package NumberPrograms;

import java.util.Scanner;

public class StrongNumberInRange {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static boolean isStrong(int num) {
		int Originalnum=num;
		int sum=0;
		while(num!=0) {
		int digit=num%10;
		sum+=factorial(digit);
		num/=10;	
	}
	return Originalnum==sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int first=s.nextInt();
		System.out.println("Enter last Number");
		int last=s.nextInt();
		for(int i=first;i<=last;i++) {
			if(isStrong(i)) {
				System.out.println(i+" Strong number");
			}
		}
		s.close();
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

