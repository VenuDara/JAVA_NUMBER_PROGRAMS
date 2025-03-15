package NumberPrograms;

import java.util.Scanner;

public class EvenorNot {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = s.nextInt();
	if(num%2==0) {
		System.out.println("Even Number");
	}
	
	else {
		System.out.println("Odd Number");
	}
	s.close();
}
}
