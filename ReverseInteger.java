package Recursion_basics;

import java.util.Scanner;

public class ReverseInteger {
	public static int ReverseInt(int n) {
		int rev=0;
		while(n!=0) {
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
		}
		return (int) rev;
	}
	public static void main(String[] args) {
		System.out.print("Enter the Digits:");
    	Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int digits= ReverseInt(n);
        System.out.println("Reverse int:"+digits);
        scan.close();
	}
}
