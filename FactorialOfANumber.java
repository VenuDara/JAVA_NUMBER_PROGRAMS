package NumberPrograms;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = s.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println(fact);
		s.close();

	}

}
