package NumberPrograms;

import java.util.Scanner;

public class SwapNumbersUsingThirdVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a");
		int a = s.nextInt();
		System.out.println("Enter b");
		int b = s.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		s.close();

	}

}
