package Recursion_basics;

import java.util.Scanner;

public class Sumfirstn {
	static int sum=0;
	static int i=1;
	public static void f(int N) {
		if(i>N) {
			System.out.println(sum);
			return;
		}
		sum=sum+i;
		i++;
		f(N);
	}
	public static void main(String[] args) {
		System.out.println("Enter a  Number:");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		 f(N);
	     scan.close();
	}

}
