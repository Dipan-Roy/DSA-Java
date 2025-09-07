import java.util.*;

public class loops {
    public static void main(String args[]) {
        //while loop (Print no.s from 1-10)
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("---------------");

        // Qs- Sum of first n natural no.s
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int counter = 1;
        int sum = 0;
        while(counter<=n){
            sum +=counter;
            counter++;
        }
        System.out.println("The sum of first n natural no. is : " + sum);
        System.out.println("---------------");

        // for loop (print pattern)
        for(int i2 = 1; i2 <= 4; i2++) {
            System.out.println("****");
        }
        System.out.println("---------------");

        // print Reverse of a no.
        int num = 2204;

        while(num > 0){
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10; // num /= 10
        }
        System.out.print("\n");
        System.out.println("---------------");

        // Reverse a no.
        int num2 = 10899;
        int rev = 0;

        while(num2 > 0){
            int lastDigit = num2 % 10;
            rev = (rev * 10) + lastDigit;
            num2 = num2 / 10;
        }
        System.out.println(rev);
        System.out.println("---------------");

        // do-while loop
        int iterator = 1;

        do {
            System.out.println("Hello World");
            iterator++;
        } while(iterator <= 10);

        // Qs(exit when multiple of 10 is entered)- using break;
        while(true) {
            System.out.print("Enter a no : ");
            int input = sc.nextInt();
            if((input % 10) == 0) {
                System.out.println("Chala ja bsdk!!");
                break;
            } else {
                System.out.println("you entered : " + input);
            }
        }
        System.out.println("---------------");


        // Qs(Display all numbers except the multiples of 10) - using continue;
        do{
          System.out.print("Enter a no : ");  
          int input = sc.nextInt();
          if(input == 0) {
            break;
          }
          if((input % 10) == 0) {
            System.out.println("Enter 0 to exit.");
            continue;
          }
          System.out.println("you entered : " + input);
        } while(true);
    } 
}