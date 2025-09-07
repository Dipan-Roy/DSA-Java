import java.util.*;

public class Primeno { // a no. n is a prime no. only when it is completely divisible by 1 and the no. itself(n)
    public static void main(String args[]){
        System.out.print("Enter a no. n : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Boolean isPrime = true;

        if(n == 2) {
            System.out.println("n is a prime no.");
        } else {
            for(int i = 2; i <= n-1; i++) { // optimised loop => int i = 2 to i<=Math.sqrt(n)
                if(n % i == 0){ // n is a multiple of i (and, i is not equal to 1 or n)
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println("n is a prime no.");
            } else {
                System.out.println("n is NOT a prime no.");
            }
        }
    }
}