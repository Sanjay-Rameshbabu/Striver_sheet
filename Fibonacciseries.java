package basic;
import java.util.*;

//without using recursion
public class Fibonacciseries {
	public static void main(String[] args) {
		System.out.println("Enter a  count:");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
	     scan.close();
	     int n1=0;
	     int n2=1;
	     System.out.print(n1+" "+n2+" ");
	     for(int i=2;i<N;i++) {
	    	 int n3=n1+n2;
	    	 n1=n2;
	    	 n2=n3;
	    	 System.out.print(n3+" ");
	     }
	     
	}

}
