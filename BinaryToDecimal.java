import java.util.*;

public class BinaryToDecimal{

    public static int bi_to_dec(int num){
        int decimalNo = 0;
        int pow = 0;

        while(num>0){
            int lastDigit = num % 10;
            decimalNo += (lastDigit * (int)(Math.pow(2,pow))); // Math.pow() always returns a double, 
            pow++;                                             // and you need to cast it manually if you want it as an int or float.

            num = num / 10;
        }

        return decimalNo;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary no : ");
        int num = sc.nextInt();

        System.out.println("The decimal equivalent of " + num + " is " + bi_to_dec(num));
    }
}