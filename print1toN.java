package Recursion_basics;
import java.util.*;
public class print1toN {
	static int i=1;
	public static void f(int N) {
		if(i>N) {
			return;
		}
		System.out.println(i);
		i++;
		f(N);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		 f(N);
	      scan.close();
	}

}
