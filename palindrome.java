package basic;

import java.util.Scanner;

public class palindrome {
	 static boolean palindromenumber(int n) {
		int rev=0;
		int dup=n;
		while(n>0) {
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;	
			}
			if(dup==rev) {
				return true;
			}else {
	            return false;
	            }	
	}

	public static void main(String[] args) {
		System.out.print("Enter the Digits:");
    	Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        if( palindromenumber(n))         System.out.println("Palindrome Number ");
        else         System.out.println("Not Palindrome Number");
        scan.close();


	}

}
