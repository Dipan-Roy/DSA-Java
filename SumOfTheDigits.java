import java.util.*;

public class SumOfTheDigits {

    public static int digitSum(int num){
        int sum = 0;
        while(num>0){
            int lastDigit = num % 10;
            sum += lastDigit;

            num /= 10;
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no : ");
        int num = sc.nextInt();

        System.out.println("The sum of the digits are : " + digitSum(num));
    }
}