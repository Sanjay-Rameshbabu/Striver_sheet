package Recursion_basics;
import java.util.*;
public class recursivenameprint {
	static void f(int i,int n) {
		if(i>n) {
			return;
		}
		System.out.println("Ruban");
		i++;
		f(i,n);
	}
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		    f(1,n);
		      scan.close();
	}

}


/*	static int count=0;
    static void f(int n) {
	 if(count==n) {
	  return;}
	   System.out.println(count);
	   count+=1;
	    f(n);
	    */
	 
 
	

