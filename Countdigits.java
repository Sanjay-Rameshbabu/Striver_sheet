package basic;
import java.util.Scanner;
//import java.lang.Math;
public class Countdigits {
    public static void main(String[]args) {
    	System.out.print("Enter the Digits:");
    	Scanner scan=new Scanner(System.in);
  	    int count=0;
    	int n=scan.nextInt();
	 while(n>0) {
		 int lastdigit=n%10;
		 System.out.println(lastdigit);
		 count++;
		 
		  n=n/10; 
	 }
	 System.out.println("count:"+count);
     scan.close();
    	
 }
}

// Using  math formula:
//int count=(int)Math.log10(n)+1;
//System.out.println(count);