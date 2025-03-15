package NumberPrograms;

import java.util.Scanner;

public class nthFibinocciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if(num<=0) {
			System.out.println("Invalid number");
		}
		else if(num==1) {
			System.out.println("nth number is "+0);
		}
		else if(num==2) {
			System.out.println("nth number is "+1);
		}
		else {
			int fn=0;
			int sn=1;
			int nth=0;
			for(int i=3;i<=num;i++) {
				nth = fn+sn;
				fn=sn;
				sn=nth;
			}
			System.out.println("nth number is "+nth);
		}

	}

}
