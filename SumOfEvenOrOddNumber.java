package NumberPrograms;

import java.util.Scanner;

public class SumOfEvenOrOddNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = s.nextInt();
		System.out.println("Enter the last number: ");
		int second = s.nextInt();
		int sum=0;
		for(int i=first;i<=second;i++) {
			if(i%2==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum+" is the sum of even numbers");
		s.close();

	}

}
