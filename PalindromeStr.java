package Recursion_basics;
import java.util.*;

public class PalindromeStr {
	public static boolean palindrome(int i,String N) {
	    
		if(i>N.length()/2) return true;
		if(N.charAt(i)!=N.charAt(N.length()-i-1)) return false;
		return palindrome(i+1,N);
	}


	public static void main(String []args) {
	System.out.println("Enter a  String:");
	Scanner scan=new Scanner(System.in);
	String N=scan.nextLine();
	String str=N.toLowerCase();
	boolean result= palindrome(0,str);
	
	System.out.println(result);
     scan.close();
	
}
}