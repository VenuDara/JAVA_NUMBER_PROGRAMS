package NumberPrograms;

import java.util.Scanner;

public class ProductOfFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num = s.nextInt();
		int pro = 1;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				pro*=i;
			}
		}
		System.out.println(pro);
		s.close();
}
}
