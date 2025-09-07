import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(int num){
        int originalNum = num;
        int reverse = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;

            num /= 10;
        }

        if(originalNum == reverse){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in); 

      System.out.print("Enter a no : ");
      int num = sc.nextInt();

      if(isPalindrome(num)){
        System.out.println("It is a Palindrome !!");
      } else {
        System.out.println("It is not a Palindrome !!");
      }
    }
}