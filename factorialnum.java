package basic;

import java.util.Scanner;

public class factorialnum {
	static int f(int N) {
		if(N==0) {
			return 1;
		}
		return N*f(N-1);  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a  Number for factorial:");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int result= f(N);
		System.out.println(result);
	     scan.close();
	}
//	To print the factorial till N
/*class Solution {
    class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> arr=new ArrayList();
        long i=1;
        long factorial=1;
        while(factorial<=n){
            arr.add(factorial);
            i++;
            factorial=factorial*i;
        }
        return arr;
	      }
    }
*/


}
