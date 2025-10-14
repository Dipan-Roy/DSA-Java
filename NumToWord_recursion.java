// You are given a number (eg - 2019), convert it into a String of english like "two zero one nine".
// Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number can't be 0.

public class NumToWord_recursion {

    static String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printNumbers(int num, String arr[]){
        if(num == 0){
            return;
        }

        int lastDigit = num%10;
        printNumbers(num/10, arr);
        System.out.print(arr[lastDigit] + " "); 
    }

    public static void main(String args[]){
        int num = 2025;
        printNumbers(num, arr);
    }
}