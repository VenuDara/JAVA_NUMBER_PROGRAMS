package NumberPrograms;

import java.util.Scanner;

public class FibinocciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int fn=0;
		int sn=1;
		int next=0;
		for(int i=3;i<=num;i++) {
			//System.out.println(fn);
			next = fn+sn;
			fn=sn;
			sn=next;
		}
		System.out.println(next);
		s.close();
	}
}
