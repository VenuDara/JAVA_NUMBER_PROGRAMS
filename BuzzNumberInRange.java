package NumberPrograms;

import java.util.Scanner;

public class BuzzNumberInRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num = s.nextInt();
		System.out.println("Enter the last number");
		int last=s.nextInt();
		for(int i=num;i<=last;i++) {
		if(i%7==0 || i%10==7) {
			System.out.println(i+" is Buzz number");
		}
		}
		s.close();

	}

}
