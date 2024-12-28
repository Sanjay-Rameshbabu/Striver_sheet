package Recursion_basics;
import java.util.*;
public class Recursion0to3 {
	static int count=0;
    static void f(int n) {
	 if(count==n) {
	  return;}
	   System.out.println(count);
	   count+=1;
	    f(n);
	    
	 }	 
 
	public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   int n=scan.nextInt();
    f(n);
    scan.close();
	}

}
