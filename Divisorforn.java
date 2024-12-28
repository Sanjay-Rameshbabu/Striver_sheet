package basic;
import java.util.ArrayList;
import java.util.Scanner;

public class Divisorforn {
	  public static void main(String[] args) {
	    System.out.print("Enter the Digits:");
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int sqrtn=(int)Math.sqrt(n);
	    if (n > 0) {
	      ArrayList<Integer> arr = new ArrayList<Integer>();
	      for (int i = 1; i <= sqrtn; i++) {
	        if (n % i == 0) {
	          arr.add(i);
	          
	        }
	        if(i!=n/i) {
	        	  arr.add(n/i);
	          }
	      }
	      System.out.println(arr);
	    }
	    scan.close();
	  }

	}

//check takeuforward -basics -know basic maths-print divsor for another logic too.

