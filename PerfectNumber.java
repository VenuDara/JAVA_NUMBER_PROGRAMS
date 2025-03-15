package NumberPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The number:");
		int num = s.nextInt();
		int per = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				per+=i;
			}
		}
		//per=per-num;
		if(num==per) {
			System.out.println(per+" is Perfect number");
		}
		else {
			System.out.println(per+" is Not Perfect Number");
		}
		s.close();

	}

}
