package basic;

import java.util.*;

public class Gcdnumber {
	public static void main(String[] args) {
		System.out.print("Enter the n1:");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter the n2:");
		int n2 = scan.nextInt();
		if (n1 > 0 && n2 > 0) {
			int gcd = 1;
			for (int i = 1; i <= Math.min(n1, n2); i++) {
				if (n1 % i == 0 && n2 % i == 0) {
					gcd = i;
				}
			}
			System.out.println(gcd);
		}
		scan.close();
	}

}
