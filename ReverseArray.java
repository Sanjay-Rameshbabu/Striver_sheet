package Recursion_basics;

import java.util.*;

public class ReverseArray {
	static ArrayList<Integer> reverseArray(ArrayList<Integer>arr) {
		 int arrlength=arr.size();
		ArrayList <Integer>temp= new ArrayList<Integer>();
		for(int i=arrlength-1;i>=0;i--) {	
			temp.add(arr.get(i));
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println("Enter a  Number for array length:");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		System.out.print("Enter elements for array:");
		ArrayList <Integer>arr= new ArrayList<Integer>();
		scan.nextLine();
		for(int i=0;i<N;i++) {
			int arritem=scan.nextInt();
			arr.add(arritem);
		}
		System.out.println(arr);
		ArrayList<Integer>result= reverseArray(arr);
		System.out.println("Reserved array:"+result);
	     scan.close();
	}

}

// Swapping elements.
// for recursion - reverseArray(arr, start,end)
/*public class Main {
	   //Function to print array
	   static void printArray(int arr[], int n) {
	      System.out.print("Reversed array is:- \n");
	      for (int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }
	   //Function to reverse array 
	   static void reverseArray(int arr[], int n) { // reverseArray(arr, start,end)
	      int p1 = 0, p2 = n - 1;
	      while (p1 < p2) {
	         int tmp = arr[p1];
	         arr[p1] = arr[p2];
	         arr[p2] = tmp;
	         
	         p1++;
	         p2--;
	         // for recursion-reverseArray(arr, start+1,end-1)
	      }
	      printArray(arr, n);
	   }
	   public static void main(String[] args) {
	      int n = 5;
	      int arr[] = { 5, 4, 3, 2, 1};
	      reverseArray(arr, n);// recursion-(arr,0,n-1)

	   }
	}  */
