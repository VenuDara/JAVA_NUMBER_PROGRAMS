package NumberPrograms;

import java.util.Scanner;

public class ToFindSmallestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		int num = s.nextInt();
		int Smallesttnum = 10;
		while(num>0) {
			int dig = num%10;
			if(dig<Smallesttnum) {
				Smallesttnum=dig;
			}
			num/=10;
		}
		System.out.println("The Smallest number is " + Smallesttnum);
		s.close();

	}

}
