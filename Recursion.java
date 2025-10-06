public class Recursion{

    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;

        // Time complexity: O(n)
        // Space complexity: O(n)
    }

    public static void main(String args[]){
        int n = 5;
        printDec(n);
        System.out.println();
        printInc(n);
        System.out.println();
        System.out.println(factorial(n));
    }
}