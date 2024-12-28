package Recursion_basics;

public class palindromeusingtwopointer {
  static boolean rev(String str, int n) {
    int start = 0;
    int end = n - 1;
     while(start<end){
      char l = str.charAt(start);
      char r = str.charAt(end);
      if (!Character.isLetterOrDigit(l)) {
        start++;
      } 
      else if (!Character.isLetterOrDigit(r)) {
        end--;
      }
       else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
        return false;
      } 
      else {
        start++;
        end--;   
      }
      }
      return true;
    }
  public static void main(String[] args) {
    String str = "madam";
    int n = str.length();
    boolean ans = rev(str, n);
    if (ans == true) {
      System.out.println("palindrome");
    } else {
      System.out.println("no palindrome");
    }
  }
}
