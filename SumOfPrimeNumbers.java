package NumberPrograms;

import java.util.Scanner;

public class SumOfPrimeNumbers {
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num = s.nextInt();
		System.out.println("Enter last number:");
		int last=s.nextInt();
		int sum=0;
		int product=1;
		for(int i=num;i<=last;i++) {
			if(isPrime(i)) {
				sum+=i;
				product*=i;
				System.out.println(i);
			}
			
		}
		System.out.println(sum);
		System.out.println(product);
		s.close();
	
	}
	
}
