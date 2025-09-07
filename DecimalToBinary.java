import java.util.*;

public class DecimalToBinary{

    public static int dec_to_bi(int n){
        int binary = 0;
        int pow = 0;
        while(n>0){
            int remainder = n % 2;
            binary = binary + (remainder * (int)(Math.pow(10, pow)));
            pow++;

            n = n / 2;
        }
        
        return binary;
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal no : ");
        int n = sc.nextInt();

        System.out.println("The Binary form of " + n + " is " + dec_to_bi(n));
    }
}