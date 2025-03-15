package NumberPrograms;

import java.util.Scanner;

public class ToFindLargestNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		int Largestnum = 0;
		while(num>0) {
			int dig = num%10;
			if(dig>Largestnum) {
				Largestnum=dig;
			}
			num/=10;
		}
		System.out.println("The Largest number is " + Largestnum);
		s.close();

	}
}
