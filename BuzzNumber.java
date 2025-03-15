package NumberPrograms;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = s.nextInt();
		
		if(num%7==0 || num%10==7) {
			System.out.println(num+" is Buzz number");
		}
		else {
			System.out.println(num+" is not a Buzz Number");
		}
		s.close();

	}

}
