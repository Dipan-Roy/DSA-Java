import java.util.*;

public class allPrimesInRange{

    public static boolean isprime(int n){ // acts as a "Helper Function" in this program
        if(n == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    
    public static void primesInRange(int n) {
        for(int i = 2; i<=n; i++) {
            if(isprime(i)){
                System.out.print(i + ", ");
            } 
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Range : ");
        int n = sc.nextInt();

        primesInRange(n);
    }
}