package NumberPrograms;

import java.util.Scanner;

public class spyNumberInRange {
	public static boolean isSpy(int num) {
		int sum = 0;
		int pro = 1;
		while(num>0) {
			int digit = num%10;
			sum+=digit;
			pro*=digit;
			num/=10;
		}
		return sum==pro;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting Number");
		int start = s.nextInt();
		System.out.println("Enter ending Number");
		int end = s.nextInt();
		for(int i=start;i<=end;i++) {
		if(isSpy(i)) {
			System.out.println(i+" is Spy Number");
		}
		}
		s.close();
	}
	
}
