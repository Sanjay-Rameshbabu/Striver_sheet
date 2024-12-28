package basic;
import java.util.*;
public class Armstrong {
  public static boolean ArmStrong(int n) { 
	  int orginialnum=n;
	  int armstrongnum = 0;
	  int k = String.valueOf(n).length();
	  //valueof-used to convert any data type into String 
	/*This is used to find the length of a n and
	each digit must be raised to the power of the total number of digits*/
	  while(n>0) {
		  int lastdigit=n%10;
		  armstrongnum=(int)(armstrongnum+ Math.pow(lastdigit, k));
		  n=n/10;	  
	  }
	return  orginialnum==armstrongnum;
  }
	public static void main(String[] args) {
		System.out.print("Enter the Digits:");
 	Scanner scan=new Scanner(System.in);
      int n= scan.nextInt();
      boolean armnum= ArmStrong(n);
      System.out.println(armnum);
      scan.close();
		
	}

}

/*
package basics;
import java.util.*;
public class Armstrong {
  public static int ArmStrong(int n) { 
	  int orginialnum=n;
	  int armstrongnum = 0;
	  int k = String.valueOf(n).length();
	  //valueof-used to convert any data type into String 
//	This is used to find the length of a n and
//	each digit must be raised to the power of the total number of digits
	  while(n>0) {
		  int lastdigit=n%10;
		  armstrongnum=(int)(armstrongnum+ Math.pow(lastdigit, k));
		  n=n/10;	  
	  }
	return  armstrongnum;
  }
	public static void main(String[] args) {
		System.out.print("Enter the Digits:");
 	Scanner scan=new Scanner(System.in);
      int n= scan.nextInt();
      int armnum= ArmStrong(n);
      if(armnum==n)
      System.out.println(armnum + " is a ArmStrong number");
      else
    	  System.out.println(n +"is not armstrongnumber");
      scan.close();	
	}
}*/