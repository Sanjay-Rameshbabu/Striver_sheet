package basic;

import java.util.*;
 
//prime number is 2factors - 1 and itself.

public class Checkprime {
 static boolean checkprimenumber(int n) {
	 int count=0;
	 for(int i =1;i<=n;i++) {
		 if(n %i == 0) {
			 count+=1;
		 }
	 }
	 if(count==2) {
		 return true;
		 }
	 else {
		 return false;
		 }
	 
 }
	public static void main(String[] args) {
		System.out.println("Enter the Number:");
	 	Scanner scan=new Scanner(System.in);
	    int n= scan.nextInt();
	    boolean primenum= checkprimenumber(n);
	    if (primenum) {
	        System.out.println(n + " is a prime number.");
	    } else {
	        System.out.println(n + " is not a prime number.");
	    }
	      scan.close();

	}
}

