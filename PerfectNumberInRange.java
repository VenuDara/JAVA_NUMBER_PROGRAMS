package NumberPrograms;

import java.util.Scanner;

public class PerfectNumberInRange {
  public static boolean isPerfect(int num) {
	  int sum=0;
	  for(int i=1;i<num;i++) {
		  if(num%i==0) {
			  sum+=i;
		  }
	  }
	  return sum==num;
  }
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter first number:");
	int num = s.nextInt();
	System.out.println("Enter last number:");
	int last = s.nextInt();
	for(int i=num;i<=last;i++) {
	if(isPerfect(i)) {
		System.out.println(i+" is a Perfect number");
	}
	}
s.close();	
}	
	
}
