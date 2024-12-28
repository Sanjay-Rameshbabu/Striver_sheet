package Recursion_basics;

import java.util.Scanner;

public class printnto1 {
	public static void f(int i,int N) {
		if(i==0) {
			return;
		}
		System.out.println(i);
		i--;
		f(i,N);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int i=N;
		 f(i,N);
	      scan.close();

	}

}
