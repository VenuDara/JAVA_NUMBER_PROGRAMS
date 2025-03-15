package NumberPrograms;

import java.util.Scanner;

public class ToPrintTableOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int first = s.nextInt();
		System.out.println("Enter the Last number: ");
		int last = s.nextInt();
		for (int i = first; i <= last; i++) {
			System.out.println();
			System.out.println("The Table Of "+i);
			for (int j = 1; j <= 10; j++) {
				{
					System.out.println(i + " * " + j + " = " + i * j);
				}
				
			}

		}
		s.close();
	}
}
