package NumberPrograms;

import java.util.Scanner;

public class SpyNumber {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = s.nextInt();
	if(isSpy(num)) {
		System.out.println(num+" is Spy Number");
	}
	else {
		System.out.println(num+" is not a Spy Number");
	}
	s.close();
}


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
}
